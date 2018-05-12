package com.example.cae.showmethemovies

import com.example.cae.showmethemovies.models.MovieDetails
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DetailsApi {

    @GET("{id}?api_key=82d02f91e27d2d6feb9cd10639c9fb4e&language=pt-BR")
    fun listMovieDetails(@Path("id") id: String): Call<MovieDetails>

}