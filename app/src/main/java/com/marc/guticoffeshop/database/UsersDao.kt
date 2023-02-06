package com.marc.guticoffeshop.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.marc.guticoffeshop.users.Usuari

@Dao
interface UsersDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUsuari(usuari: Usuari)

    @Query("SELECT * FROM user")
    fun getUsuari(): LiveData<List<Usuari>>

    @Update
    fun updateUsuari(usuari: Usuari)

    @Delete
    fun deleteUsuari(usuari: Usuari)

    @Query("SELECT * FROM user WHERE mail =:correu AND password=:password")
    fun getUsuariLogin(correu: String, password: String): LiveData<List<Usuari>>
}