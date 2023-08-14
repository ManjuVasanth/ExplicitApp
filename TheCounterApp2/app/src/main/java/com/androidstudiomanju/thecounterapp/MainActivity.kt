package com.androidstudiomanju.thecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring view
        val tv = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        // Adding functionalities
        btn.setOnClickListener(){
            tv.setText(""+increaseCounter())

        }
    }
    fun increaseCounter():Int{
        counter++
        return counter
    }
}