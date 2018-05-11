package com.example.cae.showmethemovies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cae.showmethemovies.models.MoviesResult
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity: AppCompatActivity() {

    val adapter = MoviedbAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter
        fetchMoviedb()
    }

    private fun fetchMoviedb() {
        val retrofit = RetrofitHelper.getRetrofit()
        val api = retrofit?.create(MoviedbApi::class.java)

        api?.listVideos()?.enqueue(object : Callback<MoviesResult> {
            override fun onFailure(call: Call<MoviesResult>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<MoviesResult>?, response: Response<MoviesResult>?) {
                adapter.items = response?.body()?.items ?: emptyList()
            }
        })
    }
                       

}

