package com.irfan.moviecapstone.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.irfan.core.domain.usecase.MovieUseCase

class HomeViewModel(movieUseCase: MovieUseCase) : ViewModel() {

    val movie = movieUseCase.getAllMovie().asLiveData()
}