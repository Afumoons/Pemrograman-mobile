package com.example.pemrograman_android

//Format List ResepData
data class ResepData(
    val namaResep: String,
    val captionResep: String,
    val bahanResep: String,
    val caraResep: String,
    // Type data image Int karena type R.drawable.[nama_resource] berupa Integer
    val image: Int
)

