package com.irfan.moviecapstone.detail

import androidx.lifecycle.ViewModel
import com.irfan.core.domain.model.Movie
import com.irfan.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {

    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) = movieUseCase.setFavoriteMovie(movie, newStatus)
}