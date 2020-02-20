package com.example.pemrograman_android

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi komponen
        val BTNAdd=findViewById<ImageButton>(R.id.BTNAdd)
        val BTNDelete = findViewById<ImageButton>(R.id.BTNDelete)
        val TxtNama=findViewById<EditText>(R.id.TxtNama)
        val RadioGroup1 =findViewById<RadioGroup>(R.id.RG1)
        val CBCoding=findViewById<CheckBox>(R.id.CBCoding)
        val CBReading=findViewById<CheckBox>(R.id.CBReading)
        val CBTraveling=findViewById<CheckBox>(R.id.CBTraveling)

        //Event pilih Radio button
        RadioGroup1.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            Toast.makeText(applicationContext,"Gender terpilih : ${radio.text}",Toast.LENGTH_SHORT).show()

            //Klik Button Add
            BTNAdd.setOnClickListener{
                Toast.makeText(this@MainActivity,"Nama: "+TxtNama.text+", gender: "+radio.text, Toast.LENGTH_LONG).show()}
        }

        //Klik Button Delete
        BTNDelete.setOnClickListener {
            TxtNama.text.clear()
            Toast.makeText(this@MainActivity,"Berhasil didelete",Toast.LENGTH_LONG).show()}

        //Checkbox Coding check/uncheck
        CBCoding.setOnCheckedChangeListener {Coding, isChecked ->
            if (CBCoding.isChecked == true){
                printHobi("check","Hobi Coding")
            }else{
                printHobi("uncheck","Hobi Coding")
            }
        }

        //Checkbox Reading check/uncheck
        CBReading.setOnCheckedChangeListener {buttonView, isChecked ->
            if (CBReading.isChecked == true){
                printHobi("check","Hobi Reading")
            }else{
                printHobi("uncheck","Hobi Reading")
            }
        }

        //Checkbox Traveling check/uncheck
        CBTraveling.setOnCheckedChangeListener {buttonView, isChecked ->
            if (CBTraveling.isChecked == true){
                printHobi("check","Hobi Traveling")
            }else{
                printHobi("uncheck","Hobi Traveling")
            }
        }
    }

    //fungsi untuk menampilkan tulisan
    fun printHobi(tipe:String,kiriman:String){
        if (tipe=="check"){
            Toast.makeText(this@MainActivity,"Anda memilih "+kiriman,Toast.LENGTH_LONG).show()}
     else if (tipe=="uncheck"){
            Toast.makeText(this@MainActivity,"Anda batal memilih "+kiriman,Toast.LENGTH_LONG).show()}

    }
}


