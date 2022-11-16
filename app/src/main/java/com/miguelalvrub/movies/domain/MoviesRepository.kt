package com.miguelalvrub.movies.domain

interface MoviesRepository {
    fun saveMovies(movies: List<Movie>)
    fun getMovies(): List<Movie>
    fun getMovie(movieId: String): Movie?
}