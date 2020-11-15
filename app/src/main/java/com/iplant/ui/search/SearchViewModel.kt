package com.iplant.ui.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iplant.api.ApiResult
import com.iplant.models.plantdetails.PlantResult
import com.iplant.models.search.SearchResult
import com.iplant.repositories.PlantsRemoteRepository
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {

    val searchRequestSuccess: MutableLiveData<SearchResult> = MutableLiveData<SearchResult>()
    val searchRequestError: MutableLiveData<String> = MutableLiveData<String>()

    fun searchRequest(query: String) {

        viewModelScope.launch {
            when (val retrofitPost = PlantsRemoteRepository.getSearchRequest(query)) {
                is ApiResult.Success -> searchRequestSuccess.postValue(retrofitPost.data)
                is ApiResult.Error -> searchRequestError.postValue(retrofitPost.exception)
            }
        }

    }


}