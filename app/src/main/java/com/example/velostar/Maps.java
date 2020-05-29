package com.example.velostar;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.velostar.model.DataContainer;
import com.example.velostar.model.Fields;
import com.example.velostar.model.Records;
import com.example.velostar.retrofit.RetrofitClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.widget.ImageButton;
import  android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ImageButton btn_list_station;

    //manage creation of some locations
    private LatLng THABOR = new LatLng(48.114208, -1.665977);
    private LatLng MAIRIE = new LatLng(48.112102, -1.680228);

    private List<Records> listeStation = new ArrayList<>();
    private Fields uneStation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btn_list_station = findViewById(R.id.btn_liste_station);

        btn_list_station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Maps.this, ListActivity.class);
                startActivity(i);
            }
        });




        Call<DataContainer> getDatasCall = RetrofitClient.getStationService().getDatas();

        getDatasCall.enqueue(new Callback<DataContainer>() {
            @Override
            public void onResponse(Call<DataContainer> call, Response<DataContainer> response) {
                mMap.clear();
                for (int i = 0; i < response.body().getRecords().size(); i++) {

                    double[] lat = response.body().getRecords().get(i).getFields().getCoordonnes();
                    String name = response.body().getRecords().get(i).getFields().getName();
                    int velo = response.body().getRecords().get(i).getFields().getVeloDispo();
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng latLng = new LatLng(lat[0], lat[1]);

                    markerOptions.position(latLng);
                    markerOptions.title(name);
                    Marker m = mMap.addMarker(markerOptions);
                    markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
                    // move map camera


                    mMap.moveCamera(CameraUpdateFactory.newLatLng(MAIRIE));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(12.5f));
                }

            }

            @Override
            public void onFailure(Call<DataContainer> call, Throwable t) {

            }
        });

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;





//        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)
//        {
//            mMap.setMyLocationEnabled(true);
//        }
    }





//

}
