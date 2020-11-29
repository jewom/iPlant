package com.iplant.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iplant.api.ApiResult
import com.iplant.database.PlantEntity
import com.iplant.models.plantdetails.PlantResult
import com.iplant.repositories.PlantsLocalRepository
import com.iplant.repositories.PlantsRemoteRepository
import kotlinx.coroutines.launch

class DetailsViewModel(
    val args: DetailsFragmentArgs
) : ViewModel() {

    val plantRequestSuccess: MutableLiveData<PlantResult> = MutableLiveData<PlantResult>()
    val plantRequestError: MutableLiveData<String> = MutableLiveData<String>()

    val plantEntity: LiveData<PlantEntity> = PlantsLocalRepository.getPlantEntity(args.plantSlug)

    fun insertPlantEntity(plantEntity: PlantEntity){
        viewModelScope.launch {
            PlantsLocalRepository.insertPlantEntity(plantEntity)
        }
    }

    fun plantRequest(plantSlug: String) {

        viewModelScope.launch {
            when (val retrofitPost = PlantsRemoteRepository.getPlantRequest(plantSlug)) {
                is ApiResult.Success -> plantRequestSuccess.postValue(retrofitPost.data)
                is ApiResult.Error -> plantRequestError.postValue(retrofitPost.exception)
            }
        }

    }

}