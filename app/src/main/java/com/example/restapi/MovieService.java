package com.example.restapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieService {
    @GET("/JSONParsingTutorial/jsonMovie")
    Call<MovieResponse> getMovies();
}
