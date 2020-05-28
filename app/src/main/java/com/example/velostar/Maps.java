package com.example.velostar;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.velostar.model.Fields;
import com.example.velostar.model.Records;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import  android.widget.TextView;

import retrofit2.Response;
import retrofit2.Retrofit;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button btn_list_station;
    //private  TextView TextViewDetail;

    //manage creation of some locations
    private LatLng THABOR = new LatLng(48.114208, -1.665977);
    private LatLng MAIRIE = new LatLng(48.112102, -1.680228);

    private List<Records> data = new ArrayList<>();
    private Fields fields;



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

        int zoom = 12;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(THABOR, zoom));

        placerMarqueursFixes();
    }

    //placer marker

    private void  placerMarqueursFixes() {

        MarkerOptions leMarqueur;

        leMarqueur = new MarkerOptions();
        leMarqueur.position(MAIRIE);
        leMarqueur.title("MyDigitalMairie");
        leMarqueur.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mMap.addMarker(leMarqueur);

        leMarqueur = new MarkerOptions();
        leMarqueur.position(THABOR);
        leMarqueur.title("MyDigitalThabor)");
        leMarqueur.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mMap.addMarker(leMarqueur);
    }

    private void  placerMarqueursStations() {

        MarkerOptions leMarqueur;
        double Lat;
        double Lng;

        for (int i=0; i < fields.getCoordonnes().length; i++)
        {
            fields.getCoordonnes().
        }

        mMap.clear();
        placerMarqueursFixes();

        for (int i = 0; i < data.size(); i++) {
            leMarqueur = new MarkerOptions();
            leMarqueur.position(new LatLng(fields.getCoordonnes(), ));
            leMarqueur.title(fields.getName());
            leMarqueur.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
            mMap.addMarker(leMarqueur);
        }
    }

}
