package com.marc.guticoffeshop.users

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class Usuari (

    @ColumnInfo(name = "mail")
    val correu: String,
    @ColumnInfo(name = "password")
    val password: String
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var Id: Int? = null
}