package com.example.cae.showmethemovies.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MoviesResult {

    @Expose
    @SerializedName("results")
    var items: List<MovieItem>? = null

}