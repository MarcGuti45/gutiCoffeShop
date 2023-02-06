package com.marc.guticoffeshop.database

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.marc.guticoffeshop.users.Usuari

class UsersViewModel : ViewModel() {
    var usuari: LiveData<List<Usuari>>? = null;

    fun newUser(context: Context, correu: String, password: String){
        var usuari = Usuari(correu, password)

        UsersRepository.insertUser(context, usuari);
    }

    /*
    fun loginUser(context: Context, correu: String, password: String): LiveData<List<Usuari>>?{
        usuari = UsersRepository.insertUser(context, correu, password)
        return usuari
    }

     */

}