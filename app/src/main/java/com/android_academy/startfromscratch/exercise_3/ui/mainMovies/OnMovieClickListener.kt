package com.android_academy.startfromscratch.exercise_3.ui.mainMovies

import com.android_academy.db.Movie

interface OnMovieClickListener {
    fun onMovieClicked(movie: Movie, adapterPosition: Int)

}