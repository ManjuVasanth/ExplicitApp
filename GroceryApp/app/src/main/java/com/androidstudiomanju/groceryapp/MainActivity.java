package com.androidstudiomanju.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // 1.AdapterView -- RecyclerView
    RecyclerView recyclerView;
// 2 . DataSource -- ModelClass
    List<ItemModel> itemModelList;

    // 3. Adapter
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        itemModelList = new ArrayList<>();
        ItemModel item1 = new ItemModel(R.drawable.fruits,"Fruits","Organic fruits from the farm ");
        ItemModel item2 = new ItemModel(R.drawable.vegetable,"Vegetables","Fresh veggies from farm");
        ItemModel item3 = new ItemModel(R.drawable.dairy,"Dairy","Fresh dairy products");
        ItemModel item4 = new ItemModel(R.drawable.bread,"Bread","Fresh breads");
        ItemModel item5 = new ItemModel(R.drawable.chocolates,"Chocolates","Swiss chocolates from Swiss");
        itemModelList.add(item1);
        itemModelList.add(item2);
        itemModelList.add(item3);
        itemModelList.add(item4);
        itemModelList.add(item5);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(itemModelList);
        recyclerView.setAdapter(myAdapter);

    }
}