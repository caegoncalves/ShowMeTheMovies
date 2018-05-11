package com.example.cae.showmethemovies

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cae.showmethemovies.models.MovieItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_content.view.*

class MoviedbAdapter: RecyclerView.Adapter<MoviesViewHolder>() {

    var items: List<MovieItem> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_content, parent, false)
        return MoviesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.view.setOnClickListener {
            val intent = Intent(holder.view.context, MovieDetailActivity::class.java)

            holder.view.context.startActivity(intent)
        }
    }
}

class MoviesViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    val basePosterURL: String = "https://image.tmdb.org/t/p/w600_and_h900_bestv2"

    fun bind(item: MovieItem) {
        view.titleTextView.text = item.title
        view.descriptionTextView.text = item.description
        val posterMovieImageView =  view.posterImageView
        Picasso.get().load(basePosterURL + item.poster).into(posterMovieImageView)

    }

}