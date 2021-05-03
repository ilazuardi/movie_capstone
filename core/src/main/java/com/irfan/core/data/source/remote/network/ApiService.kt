package com.irfan.core.data.source.remote.network

import com.irfan.core.data.source.remote.response.ListMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("popular")
    suspend fun getList(
        @Query("api_key") api_key: String = "0a90a92a5089b71074eb703ce903b7f7"
    ): ListMovieResponse
}