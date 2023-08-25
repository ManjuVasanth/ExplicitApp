package com.androidstudiomanju

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.androidstudiomanju.explicitapp.R

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        // Receiving data from 1st Activity
        val bundle: Bundle? = intent.extras
        val age = bundle?.get("age")
        Toast.makeText(this,"Your age :" +age,Toast.LENGTH_SHORT).show()
    }
}