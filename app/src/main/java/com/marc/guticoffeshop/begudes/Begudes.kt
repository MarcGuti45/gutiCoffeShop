package com.marc.guticoffeshop.begudes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "begudes")
data class Begudes (
    @PrimaryKey
    @ColumnInfo(name = "nom")
    val nom:String,
    @ColumnInfo(name = "preu")
    val preu:Int,
    @ColumnInfo(name = "photo")
    val photo:String
    )