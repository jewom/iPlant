package com.iplant.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    val text = MutableLiveData<String>().apply {
        value = "This is settings Fragment"
    }

}