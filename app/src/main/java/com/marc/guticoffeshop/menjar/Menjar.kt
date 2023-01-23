package com.marc.guticoffeshop.menjar

import androidx.room.Entity

@Entity(tableName = "menjar")
data class Menjar (
    val nom:String,
    val preu:Int,
    val photo:String
    )