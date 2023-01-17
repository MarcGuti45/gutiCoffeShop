package com.marc.guticoffeshop.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marc.guticoffeshop.begudes.Begudes
import com.marc.guticoffeshop.cafe.Cafe
import com.marc.guticoffeshop.databinding.ItemBegudesBinding
import com.marc.guticoffeshop.databinding.ItemCafeBinding

class MenuCafeViewHolder (view: View): RecyclerView.ViewHolder(view){

    val binding = ItemCafeBinding.bind(view)

    fun render(cafeModel: Cafe, onClickListener:(Cafe) -> Unit){
        binding.tvName.text = cafeModel.nom
        binding.tvPrice.text = cafeModel.preu.toString()
        Glide.with(binding.ivCafe.context).load(cafeModel.photo).into(binding.ivCafe)

        itemView.setOnClickListener{
            onClickListener(cafeModel)
        }
    }
}