package com.androidstudiomanju.sharedprefapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var name_textview:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText :EditText = findViewById(R.id.editText)
         name_textview = findViewById(R.id.textViewName)
        val btn:Button = findViewById(R.id.btn)
        displaySavedName()
        btn.setOnClickListener(){
            val enteredText:String = editText.text.toString()
            saveNameInSharedPref(enteredText)
        }
    }

    private fun saveNameInSharedPref(enteredText: String) {
// saving the text into sharedPref
        val sharedPreferences:SharedPreferences = getSharedPreferences("UserName",
            MODE_PRIVATE)

    // writing data to shared pref
    val editor :SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("name",enteredText)
        editor.commit()
}
    // Reading data from shared pref
    fun displaySavedName(){
        val sharedPreferences:SharedPreferences= getSharedPreferences("UserName", MODE_PRIVATE)
        val s1:String? = sharedPreferences.getString("name","")
        name_textview.setText(s1)
    }    }