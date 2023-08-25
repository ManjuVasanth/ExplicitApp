package com.androidstudiomanju.viewpagerapp.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.androidstudiomanju.viewpagerapp.MainActivity
import com.androidstudiomanju.viewpagerapp.fragments.FragmentOne
import com.androidstudiomanju.viewpagerapp.fragments.FragmentThree
import com.androidstudiomanju.viewpagerapp.fragments.FragmentTwo

class MyAdapter(mainActivity: MainActivity):FragmentStateAdapter(mainActivity) {
    private val fragments_size = 3
    override fun getItemCount(): Int {
       return this.fragments_size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0-> {
                return FragmentOne()
            }
            1->{
                return FragmentTwo()
            }
            2->{
                return FragmentThree()
            }

        }
        return FragmentOne()
    }

}