package com.androidstudiomanju.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.androidstudiomanju.viewpagerapp.adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter:MyAdapter
    lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        myAdapter = MyAdapter(this)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = myAdapter
    }
}