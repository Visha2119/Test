package com.example.test.network

import com.example.test.model.RepositoriesList
import retrofit2.Call
import retrofit2.http.GET


interface Api {

    @GET("api")
    fun getResults(query: String):Call<RepositoriesList>
}

