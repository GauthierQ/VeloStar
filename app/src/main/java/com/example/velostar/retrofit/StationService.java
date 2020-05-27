package com.example.velostar.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StationService {

    @GET("records")
    Call<DataContainer> getCards();

}
