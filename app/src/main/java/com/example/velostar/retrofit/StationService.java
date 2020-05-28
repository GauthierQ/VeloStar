package com.example.velostar.retrofit;

import com.example.velostar.model.DataContainer;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StationService {

    @GET("records/1.0/search/?dataset=vls-stations-etat-tr&q=&facet=nom&facet=etat&facet=nombreemplacementsactuels&facet=nombreemplacementsdisponibles&facet=nombrevelosdisponibles&facet=lastupdate&facet=idstation&facet=coordonnees")
    Call<DataContainer> getDatas();

}
