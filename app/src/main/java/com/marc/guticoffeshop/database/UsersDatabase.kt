package com.marc.guticoffeshop.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.marc.guticoffeshop.begudes.Begudes
import com.marc.guticoffeshop.users.Usuari

@Database(
    entities = [Usuari::class],
    version = 1,
    exportSchema = true
)
abstract class UsersDatabase : RoomDatabase() {
    abstract fun usersDAO() : UsersDao

    companion object {

        @Volatile
        private var INSTANCE: UsersDatabase? = null

        fun getDatabase(context: Context): UsersDatabase {
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

        private fun buildDatabase(context: Context): UsersDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                UsersDatabase::class.java,
                "usuaris_database"
            )
                .build()

        }
    }
}