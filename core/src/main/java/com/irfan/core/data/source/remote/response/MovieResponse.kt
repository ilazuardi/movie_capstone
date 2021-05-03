package com.irfan.core.data.source.remote.response

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("original_title")
    val title: String,

    @field:SerializedName("overview")
    val description: String,

    @field:SerializedName("original_language")
    val originalLanguage: String,

    @field:SerializedName("release_date")
    val releaseYear: String,

    @field:SerializedName("vote_average")
    val voteAverage: String,

    @field:SerializedName("poster_path")
    val posterPath: String,

    @field:SerializedName("backdrop_path")
    val backdropPath: String,
)