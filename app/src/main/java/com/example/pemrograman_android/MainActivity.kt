package com.example.pemrograman_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData=createPhoneData()
        rv_parts.layoutManager=LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter=ContactAdapter(testData,{phoneItem:PhoneData->phoneItemClicked(phoneItem)})
    }
    private fun phoneItemClicked(phoneItem:PhoneData){
        val showDetailActivityIntent= Intent(this,PhoneDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT,phoneItem.phone.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createPhoneData():List<PhoneData>{
        val partList=ArrayList<PhoneData>()
        partList.add(PhoneData(933877,"Afu Sidhi Pamekas"))
        partList.add(PhoneData(442134,"Nurrachman Budi Mulya"))
        partList.add(PhoneData(756364,"Lutfi Cahyo Utomo"))
        return partList
    }
}
