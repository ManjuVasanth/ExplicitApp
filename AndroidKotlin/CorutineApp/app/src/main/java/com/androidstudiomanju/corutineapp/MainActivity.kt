package com.androidstudiomanju.corutineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvDummy:TextView = findViewById(R.id.tvDummy)
        /*  GlobalScope.launch {
            Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")
        }
        Log.d(TAG,"Hello from thread ${Thread.currentThread().name}")
    }*/
        /*GlobalScope.launch {
           // delay(1000L)
            val networkCallAnswer = doNetworkCall()
            val networkCallAnswer2 = doNetworkCall()
            Log.d(TAG,networkCallAnswer)
            Log.d(TAG,networkCallAnswer2)
        }*/
        GlobalScope.launch(Dispatchers.IO) {
            Log.d(TAG,"Starting coroutines in thread ${Thread.currentThread().name}")
            val answer= doNetworkCall()
            withContext(Dispatchers.Main){
                Log.d(TAG,"Setting text in thread ${Thread.currentThread().name}")
                tvDummy.text = answer
            }
        }
    }
    suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is the answer"

    }
}