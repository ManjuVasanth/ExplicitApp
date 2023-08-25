package com.androidstudiomanju.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.androidstudiomanju.fragments.BookFragment
import com.androidstudiomanju.fragments.GamesFragment
import com.androidstudiomanju.fragments.MoviesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
       return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0-> return BookFragment()
            1-> return GamesFragment()

        }
        return MoviesFragment()
    }
}