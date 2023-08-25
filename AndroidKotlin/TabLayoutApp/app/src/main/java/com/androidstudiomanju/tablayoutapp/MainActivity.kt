package com.androidstudiomanju.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.androidstudiomanju.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val tabsArray = arrayOf("Book","Games","Movies")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val my_adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        //linking adapter to viewpager
        viewPager.adapter = my_adapter
        // connecting view pager to tabLayout
        TabLayoutMediator(tabLayout,viewPager){
            tab,position-> tab.text = tabsArray[position]
        }.attach()

    }
}