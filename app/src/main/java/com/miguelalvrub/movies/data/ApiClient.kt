package com.miguelalvrub.movies.data

import com.miguelalvrub.movies.data.remote.MoviesApiModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Basicamente Retrofit
 *  en baseEndPoints le pasamos la url de la api movies
 *  mirar documentacion de Retrofit y adaptar
 * */
class ApiClient {
    private val baseEndPoints: String =
        "https://movies-and-shows-api.cyclic.app/"

    private val apiServices: ApiServices

    init {
        apiServices = buildApiEndPoints()
    }

    fun createRetrofitClient() = Retrofit.Builder()
        .baseUrl(baseEndPoints)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    fun buildApiEndPoints() = createRetrofitClient().create(ApiServices::class.java)

    fun getMovies(): List<MoviesApiModel>{
        val movies = apiServices.getMoviesFeed()
        val response = movies.execute()
        if (response.isSuccessful){
            return response.body() ?: emptyList()
        }
        return emptyList()
    }

    fun getMovie(movieId: String): MoviesApiModel? {
        val call = apiServices.getMovies(movieId).execute()
        return call.body()
    }


}