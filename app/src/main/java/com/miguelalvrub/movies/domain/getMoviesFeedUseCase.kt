package com.miguelalvrub.movies.domain

class getMoviesFeedUseCase(val repository: MoviesRepository) {
    fun execute(): List<Movie> {
        return repository.getMovies()
    }
}