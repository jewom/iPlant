package com.iplant.ui.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iplant.api.ApiResult
import com.iplant.models.plantdetails.PlantResult
import com.iplant.repositories.PlantsRemoteRepository
import kotlinx.coroutines.launch

class DetailsViewModel : ViewModel() {

    val plantRequestSuccess: MutableLiveData<PlantResult> = MutableLiveData<PlantResult>()
    val plantRequestError: MutableLiveData<String> = MutableLiveData<String>()

    fun plantRequest(plantSlug: String) {

        viewModelScope.launch {
            when (val retrofitPost = PlantsRemoteRepository.getPlantRequest(plantSlug)) {
                is ApiResult.Success -> plantRequestSuccess.postValue(retrofitPost.data)
                is ApiResult.Error -> plantRequestError.postValue(retrofitPost.exception)
            }
        }

    }

}