package com.example.pemrograman_android

import android.provider.ContactsContract

//Format List FakultasData
data class FakultasData(
    val namaFakultas: String,
    val deskripsiFakultas: String,
    val bulletFakultas: String,
    // Type data image Int karena type R.drawable.[nama_resource] berupa Integer
    val image: Int,
    val email: String,
    val web:String
)

