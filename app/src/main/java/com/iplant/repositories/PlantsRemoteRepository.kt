package com.iplant.repositories

import com.iplant.api.ApiHelper
import com.iplant.api.ApiResult
import com.iplant.api.safeApiCall
import com.iplant.models.plantdetails.PlantResult
import com.iplant.models.search.SearchResult

object PlantsRemoteRepository {

    suspend fun getPlantRequest(plantSlug: String): ApiResult<PlantResult> {
        return safeApiCall(call = { ApiHelper.apiService.getPlant(plantSlug) })
    }

    suspend fun getSearchRequest(query: String): ApiResult<SearchResult> {
        return safeApiCall(call = { ApiHelper.apiService.getSearch(query) })
    }

}
