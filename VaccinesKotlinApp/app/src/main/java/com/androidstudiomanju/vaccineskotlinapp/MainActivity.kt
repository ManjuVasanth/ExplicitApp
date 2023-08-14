package com.androidstudiomanju.vaccineskotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. Adapter View  : RecyclerView
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        // 2. DataSource : List of VaccineModel objects
        var vaccinesList : ArrayList<VaccineModel> = ArrayList()
        val v1 = VaccineModel("Covid-19 Vaccine",R.drawable.vaccine7)
        val v2 = VaccineModel("Heptatis B Vaccine", R.drawable.vaccine1)
        val v3 =  VaccineModel("Tetanus Vaccine", R.drawable.vaccine2)
        val v4 =  VaccineModel("Pneumococcal Vaccine", R.drawable.vaccine3)
        val v5 = VaccineModel("Measles Vaccine", R.drawable.vaccine4)
        val v6= VaccineModel("Rotavirus vaccine", R.drawable.vaccine5)
        val v7 =  VaccineModel("Cholera Vaccine", R.drawable.vaccine6)
        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)
        vaccinesList.add(v7)

        // 3. Adapter
        val adapter = MyAdapter(vaccinesList)
        recyclerView.adapter = adapter;
    }
}