package com.marc.guticoffeshop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marc.guticoffeshop.begudes.Begudes
import com.marc.guticoffeshop.R

class MenuBegudaAdapter (private val begudesList:List<Begudes>, private val onClickListener:(Begudes) -> Unit): RecyclerView.Adapter<MenuBegudaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuBegudaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MenuBegudaViewHolder(layoutInflater.inflate(R.layout.item_begudes, parent, false))
    }

    override fun onBindViewHolder(holder: MenuBegudaViewHolder, position: Int) {
        val item = begudesList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = begudesList.size

}