package com.marc.guticoffeshop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.begudes.Begudes
import com.marc.guticoffeshop.cafe.Cafe

class MenuCafeAdapter (private val cafeList:List<Cafe>, private val onClickListener:(Cafe) -> Unit): RecyclerView.Adapter<MenuCafeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuCafeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MenuCafeViewHolder(layoutInflater.inflate(R.layout.item_cafe, parent, false))
    }

    override fun onBindViewHolder(holder: MenuCafeViewHolder, position: Int) {
        val item = cafeList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = cafeList.size

}