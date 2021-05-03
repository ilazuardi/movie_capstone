package com.irfan.moviecapstone.di

import com.irfan.core.domain.usecase.MovieInteractor
import com.irfan.core.domain.usecase.MovieUseCase
import com.irfan.moviecapstone.detail.DetailMovieViewModel
import com.irfan.moviecapstone.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}