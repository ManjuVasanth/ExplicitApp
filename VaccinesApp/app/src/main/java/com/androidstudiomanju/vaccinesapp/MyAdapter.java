package com.androidstudiomanju.vaccinesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
// 4. Handling Click events
    public ItemClickListener clickListener;
    // 1. Data source
    private VaccineModel[] listData;
// constructor
    public MyAdapter(VaccineModel[] listData) {

        this.listData = listData;
    }

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // 2. View holder class
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
       // intializing widgets
        public ImageView imageView;
        public TextView textView;
        // create MyViewHolder constructor 1st then intialize the widgets
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView = itemView.findViewById(R.id.textview);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            if(clickListener!=null){
                clickListener.onClick(v,getAdapterPosition());
            }

        }
    }
    // 3. Implementing the methods
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // Instantiates a layout XML file into its corresponding View objects
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
      View listItem = inflater.inflate(R.layout.recyclerview_item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final VaccineModel myListData = listData[position];
        holder.textView.setText(listData[position].getTitle());
        holder.imageView.setImageResource(listData[position].getImage());

    }

    @Override
    public int getItemCount() {

        return listData.length;
    }

}
