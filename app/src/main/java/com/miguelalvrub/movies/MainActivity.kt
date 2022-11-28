package com.miguelalvrub.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.miguelalvrub.movies.data.ApiClient
import com.miguelalvrub.movies.data.remote.MovieApiRemoteDataSource
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}