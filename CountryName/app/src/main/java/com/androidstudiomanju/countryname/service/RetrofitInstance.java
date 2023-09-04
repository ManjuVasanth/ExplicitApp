package com.androidstudiomanju.countryname.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://api.printful.com/";

    //Singleton pattern used to create instance of Retrofit
    public static GetCountryDataService getService(){
        if(retrofit==null){
        //Instance is not created before
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
// if instance is already created
        return retrofit.create(GetCountryDataService.class);
    }
}
