package com.example.finalquiz

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DifAdapter(private val difficultyList : ArrayList<Difficulty>) :
    RecyclerView.Adapter<DifAdapter.DifViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DifViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate((R.layout.list_item),
            parent,false)
        return DifViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: DifViewHolder, position: Int) {

        val currentItem = difficultyList[position]
        Glide.with(holder.imageCar.context)
            .load(currentItem.imageUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(holder.imageCar)

        holder.name.text = currentItem.name



    }

    override fun getItemCount(): Int {
        return difficultyList.size
    }

    class DifViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imageCar: ImageView = itemView.findViewById(R.id.imageCar)
        val name: TextView = itemView.findViewById(R.id.name)


            init {
                itemView.setOnClickListener { v: View ->
                    val position: Int = adapterPosition

                    if(position == 0) {
                        val intent = Intent(v.context, FirstActivity::class.java)
                        v.context.startActivity(intent)
                    }

                    if(position == 1) {
                        val intent = Intent(v.context, SecondActivity::class.java)
                        v.context.startActivity(intent)
                    }

                    if(position == 2) {
                        val intent = Intent(v.context, ThirdActivity::class.java)
                        v.context.startActivity(intent)
                    }
                }
            }

    }

}