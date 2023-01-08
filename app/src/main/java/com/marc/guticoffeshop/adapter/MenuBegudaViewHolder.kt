package com.marc.guticoffeshop.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marc.guticoffeshop.begudes.Begudes
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.databinding.ItemBegudesBinding

class MenuBegudaViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemBegudesBinding.bind(view)

    fun render(begudesModel: Begudes, onClickListener:(Begudes) -> Unit){
        binding.tvName.text = begudesModel.nom
        binding.tvPrice.text = begudesModel.preu.toString()
        Glide.with(binding.ivBeguda.context).load(begudesModel.photo).into(binding.ivBeguda)

        itemView.setOnClickListener{
            onClickListener(begudesModel)
        }
    }
}