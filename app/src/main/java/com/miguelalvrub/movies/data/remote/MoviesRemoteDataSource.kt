package com.miguelalvrub.movies.data.remote

import com.miguelalvrub.movies.domain.Movie

interface MoviesRemoteDataSource {
    fun getMovies(): List<Movie>
    fun getMovie(movieId: String): Movie?
}