package com.marc.guticoffeshop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.menjar.Menjar
import com.marc.guticoffeshop.menjar.MenuMenjarProvider.Companion.menjarList

class MenuMenjarAdapter(private val menuMenjarList: List<Menjar>, private val onClickListener:(Menjar) -> Unit) : RecyclerView.Adapter<MenuMenjarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuMenjarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MenuMenjarViewHolder(layoutInflater.inflate(R.layout.item_menjar, parent, false))
    }

    override fun onBindViewHolder(holder: MenuMenjarViewHolder, position: Int) {
        val item = menuMenjarList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = menuMenjarList.size
}