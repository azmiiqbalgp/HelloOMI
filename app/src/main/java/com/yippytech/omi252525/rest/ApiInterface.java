package com.yippytech.omi252525.rest;

import com.yippytech.omi252525.model.InformasiModels;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by ryanbaskara on 01/01/17.
 */

public interface ApiInterface {
    @GET("newsCtrl.php")
    Call<List<InformasiModels>> getInformasi();

   /* @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/
}
