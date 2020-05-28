package com.example.velostar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.velostar.adapter.DatasAdapter;
import com.example.velostar.model.Data;
import com.example.velostar.retrofit.DataContainer;
import com.example.velostar.retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {

    Button btn_map;

    public static final String TAG ="VELOSTAR";
    private RecyclerView rv_list_station;
    private List<Data> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btn_map = findViewById(R.id.btn_map);

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ListActivity.this, Maps.class);
                startActivity(i);
            }
        });



       rv_list_station = findViewById(R.id.rv_list_station);

       final DatasAdapter datasAdapter = new DatasAdapter(data);
       rv_list_station.setAdapter(datasAdapter);
       rv_list_station.setLayoutManager(new LinearLayoutManager(this));

       Call<DataContainer> getDatasCall = RetrofitClient.getStationService().getDatas();

        getDatasCall.enqueue(new Callback<DataContainer>() {
           @Override
           public void onResponse(Call<DataContainer> call, Response<DataContainer> response) {
               Log.d(TAG, "ListActivity - getDatasCall - onResponse");
               Log.d(TAG, response.code() + "");
               Log.d(TAG, response.body().toString());
                data.clear();
                data.addAll(response.body().getData());
                datasAdapter.notifyDataSetChanged();
           }

           @Override
           public void onFailure(Call<DataContainer> call, Throwable t) {
               Log.d(TAG, "ListActivity - getDatasCall - onFailure");
               Log.d(TAG, t.getMessage());
           }
       });
    }
}
