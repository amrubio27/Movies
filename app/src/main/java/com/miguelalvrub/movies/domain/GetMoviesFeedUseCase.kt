package com.miguelalvrub.movies.domain

class GetMoviesFeedUseCase(val repository: MoviesRepository) {
    fun execute(): List<Movie> {
        return repository.getMovies()
    }
}