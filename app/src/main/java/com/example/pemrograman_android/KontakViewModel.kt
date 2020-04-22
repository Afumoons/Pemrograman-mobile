package com.example.pemrograman_android

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.pemrograman_android.contact.Kontak
import com.example.pemrograman_android.contact.KontakRepository

class KontakViewModel(application: Application) : AndroidViewModel(application) {
    private var repository: KontakRepository = KontakRepository(application)
    private var allKontak: LiveData<List<Kontak>> = repository.getAllKontak()
    fun insert(kontak: Kontak) {
        repository.insert(kontak)
    }

    fun update(kontak: Kontak) {
        repository.update(kontak)
    }

    fun delete(kontak: Kontak) {
        repository.delete(kontak)
    }

    fun deleteAllKontak() {
        repository.deleteAllKontak()
    }

    fun getAllKontak(): LiveData<List<Kontak>> {
        return allKontak
    }
}