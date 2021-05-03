package com.irfan.core.domain.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var movieId: String,
    var title: String,
    var description: String,
    var originalLanguage: String,
    var releaseYear: String,
    var voteAverage: String,
    var posterPath: String,
    var backdropPath: String,
    var isFavorite: Boolean = false
) : Parcelable