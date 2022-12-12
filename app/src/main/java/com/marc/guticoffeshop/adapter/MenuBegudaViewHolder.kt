package com.marc.guticoffeshop.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marc.guticoffeshop.Begudes
import com.marc.guticoffeshop.R

class MenuBegudaViewHolder(view: View):RecyclerView.ViewHolder(view){

    val begudes = view.findViewById<TextView>(R.id.tvName)
    val preu = view.findViewById<TextView>(R.id.tvPrice)
    val photo = view.findViewById<ImageView>(R.id.ivBeguda)

    fun render(begudesModel: Begudes){
        begudes.text = begudesModel.nom
        preu.text = begudesModel.preu
        Glide.with(photo.context).load(begudesModel.photo).into(photo)

    }
}