package com.miguelalvrub.movies.data

import com.miguelalvrub.movies.data.remote.MoviesApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Endpoints para moviesCollection
 * */
interface ApiServices {
    @GET("movies")
    fun getMoviesFeed(): Call<List<MoviesApiModel>>

    @GET("movies/{movieId}")
    fun getMovies(@Path("movieId") movieId: String): Call<MoviesApiModel>


}