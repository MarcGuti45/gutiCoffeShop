package com.marc.guticoffeshop.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.begudes.Begudes
import com.marc.guticoffeshop.databinding.ItemBegudesBinding
import com.marc.guticoffeshop.databinding.ItemMenjarBinding
import com.marc.guticoffeshop.menjar.Menjar

class MenuMenjarViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemMenjarBinding.bind(view)


    fun render(menjarModel: Menjar, onClickListener:(Menjar) -> Unit){
        binding.tvName.text = menjarModel.nom
        binding.tvPrice.text = menjarModel.preu.toString()
        Glide.with(binding.ivMenjar.context).load(menjarModel.photo).into(binding.ivMenjar)

        itemView.setOnClickListener{
            onClickListener(menjarModel)
        }
    }
}