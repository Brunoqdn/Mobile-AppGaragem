package com.example.garagem;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "http://10.0.2.2/App/";
    @GET("App.php/")
    Call<Results> getNames();
}