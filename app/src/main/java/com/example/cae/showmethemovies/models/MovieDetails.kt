package com.example.cae.showmethemovies.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class MovieDetails {

    @Expose
    @SerializedName("title")
    var titleDetails: String? = null
    @Expose
    @SerializedName("release_date")
    var releaseDateDetails: String? = null
    @Expose
    @SerializedName("overview")
    var descriptionDetails: String? = null
    @Expose
    @SerializedName("poster_path")
    var posterDetails: String? = null
    @Expose
    @SerializedName("genres")
    var genres: List<Genres>? = null
    var detailsItems:List<MovieDetails>? = null

}