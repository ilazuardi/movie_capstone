package com.irfan.core.utils

import com.irfan.core.data.source.local.entity.MovieEntity
import com.irfan.core.data.source.remote.response.MovieResponse
import com.irfan.core.domain.model.Movie

object DataMapper {

    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                movieId = it.id,
                title = it.title,
                description = it.description,
                originalLanguage = it.originalLanguage,
                releaseYear = it.releaseYear,
                voteAverage = it.voteAverage,
                posterPath = it.posterPath,
                backdropPath = it.backdropPath,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                movieId = it.movieId,
                title = it.title,
                description = it.description,
                originalLanguage = it.originalLanguage,
                releaseYear = it.releaseYear,
                voteAverage = it.voteAverage,
                posterPath = it.posterPath,
                backdropPath = it.backdropPath,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        movieId = input.movieId,
        title = input.title,
        description = input.description,
        originalLanguage = input.originalLanguage,
        releaseYear = input.releaseYear,
        voteAverage = input.voteAverage,
        posterPath = input.posterPath,
        backdropPath = input.backdropPath,
        isFavorite = input.isFavorite
    )
}