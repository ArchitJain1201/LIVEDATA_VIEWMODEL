package com.example.livedata_viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    private val factsLiveDataObject = MutableLiveData<String>("this is the fact")

    val factsLiveData: LiveData<String>
    get()= factsLiveDataObject
    fun updateLiveData(){
        factsLiveDataObject.value = "Another  Fact"
    }
}