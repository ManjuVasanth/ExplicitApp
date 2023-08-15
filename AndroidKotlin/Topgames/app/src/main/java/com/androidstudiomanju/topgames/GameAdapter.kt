package com.androidstudiomanju.topgames

import android.app.GameManager
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gamesList : ArrayList<GameModel>) :RecyclerView.Adapter<GameAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}