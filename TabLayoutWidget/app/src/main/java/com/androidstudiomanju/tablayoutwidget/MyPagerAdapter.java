package com.androidstudiomanju.tablayoutwidget;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.androidstudiomanju.CallFragment;
import com.androidstudiomanju.ChatFragment;
import com.androidstudiomanju.StatusFragment;


public class MyPagerAdapter extends FragmentStateAdapter {


private int numOfTabs;

   //
  // public MyPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int numOfTabs) {
   public MyPagerAdapter(@NonNull FragmentManager fragmentManager, int numOfTabs) {
        super(fragmentManager.getPrimaryNavigationFragment());
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch(position){
           case 0:
               return new ChatFragment();
           case 1:
               return new StatusFragment();
           case 2:
               return new CallFragment();
           default:
               return null;
       }
    }

    @Override
    public int getItemCount() {
        return numOfTabs;
    }


   /* @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }*/

}
