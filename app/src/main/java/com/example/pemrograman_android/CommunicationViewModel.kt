package com.example.pemrograman_android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mDesc = MutableLiveData<String>()
    val name: LiveData<String> get() = mName
    val desc: LiveData<String> get() = mDesc

    //Untuk mengubah txt nama
    fun setName(name: String) {
        mName.value = name
    }

    //Untuk mengubah txt desc
    fun setDesc(desc: String) {
        mDesc.value = desc
    }
}