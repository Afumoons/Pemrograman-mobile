package com.example.pemrograman_android.contact

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kontak_table")
// Inisiasi variabel untuk komponen tabel buku kontak
data class Kontak(
    var nama_d: String, var nama_b: String, var notelp: String,
    var email: String, var catatan: String, var priority: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}