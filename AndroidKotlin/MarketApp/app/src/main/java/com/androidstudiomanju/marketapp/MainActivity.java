package com.androidstudiomanju.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    RecyclerView recyclerView;
    ItemModel[] myListData;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        myListData =new ItemModel[]{
                new ItemModel(R.drawable.fruits,"Fruits","All kinds of fruits"),
                new ItemModel(R.drawable.vegetable,"Vegetables","All kinds of veggies"),
                new ItemModel(R.drawable.bread,"Bread","Breafast Ideas"),
                new ItemModel(R.drawable.chocolates,"Chocolates","Different varities of chocolates"),
                new ItemModel(R.drawable.dairy,"Milk","Milk Products")
        };
        // 3. Adapter

        adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        //Handling click events
        adapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this,"Item Name:"+myListData[pos].getItemName(),Toast.LENGTH_LONG).show();
    }
}
