package com.androidstudiomanju.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


//public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
 public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{
BottomNavigationView bottomNavigationView;
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
       // bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
   public boolean onNavigationItemSelected(@NonNull MenuItem item) {
       /*switch (item.getItemId()) {
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,firstFragment).commit();
                return true;

            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,secondFragment).commit();
                 return true;

            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,thirdFragment).commit();
                    return true;
    }*/
        int id = item.getItemId();
        if(id== R.id.profile){
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,firstFragment).commit();
            return true;
        } else if (id==R.id.home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,secondFragment).commit();
            return true;
        } else if (id==R.id.settings) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,thirdFragment).commit();
            return true;
        }
        return false;

}
}