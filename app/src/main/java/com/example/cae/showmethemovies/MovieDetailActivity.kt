package com.example.cae.showmethemovies

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.cae.showmethemovies.models.MovieDetails
import kotlinx.android.synthetic.main.detail_content.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieDetailActivity : AppCompatActivity() {

    private val intentObject: Intent = intent
    private var movieId = intentObject.getStringExtra("id")
    var adapter = DetailsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.)

        detailsRecyclerView.adapter = adapter
        fetchMovieDetails()
    }

    private fun fetchMovieDetails() {
        val retrofit = RetrofitHelper.getRetrofit()
        val api = retrofit?.create(DetailsApi::class.java)

        api?.listMovieDetails(movieId)?.enqueue(object : Callback<MovieDetails> {
            override fun onFailure(call: Call<MovieDetails>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<MovieDetails>?, response: Response<MovieDetails>?) {
                adapter = response?.body()?.detailsItems ?: emptyList()
            }
        })
    }
}