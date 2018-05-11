package com.example.cae.showmethemovies

import com.example.cae.showmethemovies.models.MoviesResult
import retrofit2.Call
import retrofit2.http.GET

interface MoviedbApi {

    @GET("upcoming?api_key=82d02f91e27d2d6feb9cd10639c9fb4e&language=pt-BR&page=1&region=BR")
    fun listVideos(): Call<MoviesResult>

}