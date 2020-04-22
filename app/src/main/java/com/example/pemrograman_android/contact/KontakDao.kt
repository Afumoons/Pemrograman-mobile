package com.example.pemrograman_android.contact

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface KontakDao {
    @Insert
    fun insert(kontak: Kontak)

    @Update
    fun update(kontak: Kontak)

    @Delete
    fun delete(kontak: Kontak)

    @Query("DELETE FROM kontak_table")
    fun deleteAllKontak()

    @Query("SELECT * FROM kontak_table ORDER BY priority DESC")
    fun getAllKontak(): LiveData<List<Kontak>>
}