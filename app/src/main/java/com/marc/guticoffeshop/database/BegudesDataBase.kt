package com.marc.guticoffeshop.database

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.marc.guticoffeshop.begudes.Begudes

@Database(
    entities = [Begudes::class],
    version = 1,
    exportSchema = true
)
abstract class BegudesDataBase : RoomDatabase() {

    abstract fun begudesDao(): BegudesDao

    companion object {

        @Volatile
        private var INSTANCE: BegudesDataBase? = null

        fun getDatabase(context: Context): BegudesDataBase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            if (INSTANCE == null) {
                synchronized(this) {
                    // Pass the database to the INSTANCE
                    INSTANCE = buildDatabase(context)
                }
            }
            // Return database.
            return INSTANCE!!
        }

        private fun buildDatabase(context: Context): BegudesDataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                BegudesDataBase::class.java,
                "begudes_database"
            )
                .build()
        }
    }
}