package com.example.pemrograman_android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mDesc = MutableLiveData<String>()
    private val mWeb = MutableLiveData<String>()
    val name: LiveData<String> get() = mName
    val desc: LiveData<String> get() = mDesc
    val web: LiveData<String> get() = mWeb

    //Untuk mengubah txt nama
    fun setName(name: String) {
        mName.value = name
    }

    //Untuk mengubah txt desc
    fun setDesc(desc: String) {
        mDesc.value = desc
    }

    //Untuk mengubah txt web
    fun setWeb(web: String) {
        mWeb.value = web
    }
}