package com.androidstudiomanju.marketapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
// 1. Data Source
    private ItemModel[] itemList;
    public static ItemClickListener clickListener;

    public MyAdapter(ItemModel[] itemList) {
        this.itemList = itemList;
    }
    public void setClickListener(ItemClickListener clickListener) {

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
       return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final ItemModel myList = itemList[position];
        holder.textView.setText(itemList[position].getItemName());
        holder.textView.setText(itemList[position].getItemDesc());
        holder.imageView.setImageResource(itemList[position].getItemImg());
    }

    @Override
    public int getItemCount() {
        return itemList.length;
    }

    // 2. ViewHolder class

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView imageView;
        public TextView textView;
        public TextView iTextView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.imageview);
            this.textView = itemView.findViewById(R.id.title_txt);
            this.iTextView = itemView.findViewById(R.id.description_text);
            itemView.setOnClickListener((View.OnClickListener) this);
        }
        @Override
        public void onClick(View v) {
            if(clickListener!=null){
                clickListener.onClick(v,getAdapterPosition());
            }


        }
    }
}
