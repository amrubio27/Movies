package com.miguelalvrub.movies.domain

import java.net.URL

data class Movie(val id: String, val title: String, val genre: String, val poster: URL)