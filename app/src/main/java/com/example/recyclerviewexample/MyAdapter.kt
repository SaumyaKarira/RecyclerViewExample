package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs : List<Song>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //LayoutInflator converts our xml file into java
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtTile.text = songs[position].Title
        holder.txtDes.text = songs[position].Des
    }

    override fun getItemCount(): Int {
        return songs.size
    }
    //nested class as MyViewHolder won't work without adapter class

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var txtTile = itemView.findViewById<TextView>(R.id.textTitle)
        var txtDes = itemView.findViewById<TextView>(R.id.textDescription)
    }
}

