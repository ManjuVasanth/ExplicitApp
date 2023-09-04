package com.androidstudiomanju.groceryapp;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<ItemModel> itemModelList;

    public MyAdapter(List<ItemModel> itemModelList) {
        this.itemModelList = itemModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
// Binds the data from your dataset to the view within the view holder
       ItemModel itemModel = itemModelList.get(position);
       holder.title.setText(itemModel.itemName);
       holder.description.setText(itemModel.itemDesc);
       holder.imageView.setImageResource(itemModel.getItemImg());
    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;
        TextView description;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.title_txt);
            description = itemView.findViewById(R.id.description_text);
        }
    }
}
