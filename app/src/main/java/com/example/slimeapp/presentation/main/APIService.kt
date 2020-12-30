package com.example.slimeapp.presentation.main

import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("/Sherenage/SlimeApp/master/Api.json")
    fun fectAllGames():Call<List<Game>>
}
