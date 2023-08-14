package com.androidstudiomanju.configurationchangedemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int counter = 0;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();
    // When the app first launched
  /*  public int getInitialCounter(){
        return counter;
    }*/
    // using MutableLiveData

    public MutableLiveData<Integer> getInitialCounter() {
        countLiveData.setValue(counter);
        return countLiveData;
    }

    // When user clicks the button
/*    public int getCounter() {
        counter++;
        return counter;*/
        //  updating live data from user
    public void getCounter(){
        counter++;
        countLiveData.setValue(counter);
    }

}
