package com.example.velostar.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    //singleton
    private static StationService stationService;

    public static StationService getStationService(){

        if (stationService == null){
            //retrofitbuilder to instantiate
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://data.rennesmetropole.fr/api/records/1.0/search/?dataset=etat-des-stations-le-velo-star-en-temps-reel&q=&facet=nom&facet=nombreemplacementsactuels&facet=nombreemplacementsdisponibles&facet=nombrevelosdisponibles")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            //create StationService
            stationService = retrofit.create(StationService.class);
        }

        return stationService;

    }


}
