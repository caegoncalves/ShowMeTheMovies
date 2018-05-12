package com.example.cae.showmethemovies.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MovieItem {

    @Expose
    @SerializedName("id")
    var id: String? = null
    @Expose
    @SerializedName("title")
    var title: String? = null
    @Expose
    @SerializedName("overview")
    var description: String? = null
    @Expose
    @SerializedName("poster_path")
    var poster: String? = null

}