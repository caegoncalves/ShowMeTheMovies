package com.example.cae.showmethemovies

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cae.showmethemovies.models.MovieItem
import kotlinx.android.synthetic.main.item_content.view.*

class MoviedbAdapter(val videoClickListener: VideoClickListener): RecyclerView.Adapter<MoviesViewHolder>() {

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

            videoClickListener.onItemClicked(item)

        }
    }
}

class MoviesViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    fun bind(item: MovieItem) {
        view.titleTextView.text = item.title
        view.descriptionTextView.text = item.description
    }
}

interface VideoClickListener {

    fun onItemClicked(item: MovieItem)
}