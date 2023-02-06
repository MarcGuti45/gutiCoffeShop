package com.marc.guticoffeshop.database

import android.content.Context
import androidx.lifecycle.LiveData
import com.marc.guticoffeshop.users.Usuari
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UsersRepository {
    companion object {
        var usersDatabase: UsersDatabase? = null

        var usuari: LiveData<List<Usuari>>? = null

        fun initializeDB(context: Context) : UsersDatabase {
            return UsersDatabase.getDatabase(context)
        }

        fun insertUser(context: Context, usuari: Usuari) {

            usersDatabase = initializeDB(context)

            CoroutineScope(Dispatchers.IO).launch {
                usersDatabase!!.usersDAO().addUsuari(usuari)
            }
        }
/*
        fun loginUser(context: Context, usuari: Usuari) {
            usersDatabase = initializeDB(context)

            CoroutineScope(Dispatchers.IO).launch {

                usersDatabase!!.usersDAO().getUsuariLogin()
            }
        }
        */

    }
}