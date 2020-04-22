package com.example.pemrograman_android.contact

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
// Inisiasi fungsi model dari buku kontak
class KontakRepository(application: Application) {
    private var kontakDao: KontakDao
    private var allKontak: LiveData<List<Kontak>>

    init {
        val database: KontakDatabase = KontakDatabase.getInstance(
            application.applicationContext
        )!!
        kontakDao = database.kontakDao()
        allKontak = kontakDao.getAllKontak()
    }

    fun insert(kontak: Kontak) {
        val insertKontakAsyncTask = InsertKontakAsyncTask(kontakDao).execute(kontak)
    }

    fun update(kontak: Kontak) {
        val updateKontakAsyncTask = UpdateKontakAsyncTask(kontakDao).execute(kontak)
    }

    fun delete(kontak: Kontak) {
        val deleteKontakAsyncTask = DeleteKontakAsyncTask(kontakDao).execute(kontak)
    }

    fun deleteAllKontak() {
        val deleteAllKontakAsyncTask = DeleteAllKontakAsyncTask(kontakDao).execute()
    }

    fun getAllKontak(): LiveData<List<Kontak>> {
        return allKontak
    }

    companion object {
        private class InsertKontakAsyncTask(kontakDao: KontakDao) : AsyncTask<Kontak, Unit, Unit>() {
            val kontakDao = kontakDao
            override fun doInBackground(vararg p0: Kontak?) {
                kontakDao.insert(p0[0]!!)
            }
        }

        private class UpdateKontakAsyncTask(kontakDao: KontakDao) : AsyncTask<Kontak, Unit, Unit>() {
            val kontakDao = kontakDao
            override fun doInBackground(vararg p0: Kontak?) {
                kontakDao.update(p0[0]!!)
            }
        }

        private class DeleteKontakAsyncTask(kontakDao: KontakDao) : AsyncTask<Kontak, Unit, Unit>() {
            val kontakDao = kontakDao
            override fun doInBackground(vararg p0: Kontak?) {
                kontakDao.delete(p0[0]!!)
            }
        }

        private class DeleteAllKontakAsyncTask(kontakDao: KontakDao) : AsyncTask<Unit, Unit, Unit>() {
            val kontakDao = kontakDao
            override fun doInBackground(vararg p0: Unit?) {
                kontakDao.deleteAllKontak()
            }
        }
    }
}