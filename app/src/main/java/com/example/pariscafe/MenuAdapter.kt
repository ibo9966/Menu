package com.example.pariscafe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter (private val menuList:ArrayList<Menu>)
    :RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){

    var onItemClick: ((Menu) ->Unit)?=null

    class MenuViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.imageView)
        val textViewAd:TextView=itemView.findViewById(R.id.textViewAd)
        val textViewFiyat:TextView=itemView.findViewById(R.id.textViewFiyat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val menu=menuList[position]
        holder.imageView.setImageResource(menu.image)
        holder.textViewAd.text=menu.name
        holder.textViewFiyat.text=menu.fiyat

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(menu)
        }
    }

    override fun getItemCount(): Int {
        return menuList.size
    }
}