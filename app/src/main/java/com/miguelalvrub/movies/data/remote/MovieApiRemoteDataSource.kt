package com.miguelalvrub.movies.data.remote

import com.miguelalvrub.movies.data.ApiClient
import com.miguelalvrub.movies.domain.Movie

class MovieApiRemoteDataSource(val apiClient: ApiClient) : MoviesRemoteDataSource {

    override fun getMovies(): List<Movie> {
        val moviesCollection = apiClient.getMovies().subList(0, 15)
        return moviesCollection.map {
            it.toDomain()
        }
    }

    override fun getMovie(movieId: String): Movie? {
        return apiClient.getMovie(movieId)?.toDomain()
    }
}