package com.androidstudiomanju.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate() is called",Toast.LENGTH_SHORT).show()

        }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,
            "onStart() is called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,
            "onResume() is called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,
            "onRestart() is called",
            Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,
            "onPause() is called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,
            "onStop() is called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,
            "onDestroy() is called",
            Toast.LENGTH_SHORT).show()
    }
}