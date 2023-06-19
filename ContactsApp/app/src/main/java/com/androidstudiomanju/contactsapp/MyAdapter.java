package com.androidstudiomanju.contactsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ContactsModal[] listdata;
    private ItemClickListener clickListener;

    public MyAdapter(ContactsModal[] listdata) {
        this.listdata = listdata;
    }

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View
            .OnClickListener {
        public ItemClickListener clickListener;
        public ImageView imageView;
        public TextView nametextView;
        public TextView numbertextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.nametextView = itemView.findViewById(R.id.nametextView);
            this.numbertextView = itemView.findViewById(R.id.numbertextView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (clickListener != null) {
                clickListener.onClick(v, getAdapterPosition());
            }

            }

        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View listItem = inflater.inflate(R.layout.contactsrecyclerview, parent, false);
            MyViewHolder viewHolder = new MyViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            final ContactsModal myListData = listdata[position];
            holder.nametextView.setText(listdata[position].getContactName());
            holder.numbertextView.setText(listdata[position].getContactNumber());
            holder.imageView.setImageResource(listdata[position].getContactImage());
        }

        @Override
        public int getItemCount() {
            return listdata.length;
        }
    }

