package com.example.restapi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private static MovieService service;
    public static MovieService getMovieService(){
        if(service == null){
            String API_BASE_URL = "http://www.omdbapi.com/?s=batman&apikey=2268147d";
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            Retrofit.Builder builder = new Retrofit.Builder().baseUrl(API_BASE_URL).addConverterFactory(GsonConverterFactory.create());
            Retrofit retrofit = builder.client(httpClient.build()).build();
            service = retrofit.create(MovieService.class);
        }
        return service;
    }
}
