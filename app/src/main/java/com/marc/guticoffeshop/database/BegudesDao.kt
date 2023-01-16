package com.marc.guticoffeshop.database

import android.provider.ContactsContract
import androidx.room.*
import com.marc.guticoffeshop.begudes.Begudes
import kotlinx.coroutines.flow.Flow

@Dao
interface BegudesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addNote(begudes: Begudes)

    @Query("SELECT * FROM begudes ORDER BY nom DESC")
    fun getBegudes(): Flow<List<Begudes>>

    @Update
    suspend fun updateNote(begudes: Begudes)

    @Delete
    suspend fun deleteNote(begudes: Begudes)

}
