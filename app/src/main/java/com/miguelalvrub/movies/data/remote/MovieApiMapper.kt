package com.miguelalvrub.movies.data.remote

import com.miguelalvrub.movies.domain.Movie

/**
 * Aqui se decalaran funciones que se pueden volver a usar(?)
 * */

fun MoviesApiModel.toDomain(): Movie {
    return Movie(
        this.id, this.title, this.genre, this.poster
    )
}