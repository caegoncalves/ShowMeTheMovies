package com.example.cae.showmethemovies.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Genres {

    @Expose
    @SerializedName("name")
    var name: String? = null
}