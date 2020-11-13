package com.iplant.api

import com.iplant.models.SearchResult
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @GET("plants/search")
    suspend fun getSearch(
        @Query("q") query: String
    ): Response<SearchResult>

}