package com.androidstudiomanju.corutineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlobalScope.launch {
            Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")
        }
        Log.d(TAG,"Hello from thread ${Thread.currentThread().name}")
    }
}