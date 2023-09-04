package com.androidstudiomanju.jsonparser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
//Widgets
    TextView name, salary;
    //JSON String
    String JSON_STRING = "{\"employee\":{\"name\":\"Manju\",\"salary\":50000}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Reference for TextView
        name = findViewById(R.id.name);
        salary = findViewById(R.id.salary);
        //Getting JSON objects
        try{
            JSONObject obj = new JSONObject(JSON_STRING);
            // Fetching JSONObject named employee
            JSONObject employee = obj.getJSONObject("employee");
            //Getting Employee name and salary
            name = employee.getString("name");
            salary = employee.getString("salary");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}