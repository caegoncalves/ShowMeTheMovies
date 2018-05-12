package com.example.cae.showmethemovies

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cae.showmethemovies.models.MovieDetails
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.details_item_content.view.*

class DetailsAdapter: RecyclerView.Adapter<DetailsViewHolder>() {

    var items2: List<MovieDetails> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate() // problema ao setar o arquivo de layout
        return DetailsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items2.count()
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        val item = items2[position]
        holder.bind(item)
    }
}

class DetailsViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    private val basePosterURL: String = "https://image.tmdb.org/t/p/w600_and_h900_bestv2"

    fun bind(item: MovieDetails) {
        view.detailTitleTextView.text = item.titleDetails
        view.detailReleaseDateTextView.text = item.releaseDateDetails
        view.detailGenresTextView.text = item.genres.toString()
        view.detailSynopsisTextView.text = item.descriptionDetails
        val posterMovieImageView =  view.posterImageView2
        Picasso.get().load(basePosterURL + item.posterDetails).into(posterMovieImageView)

    }

}
