package com.marc.guticoffeshop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PagarViewModel : ViewModel() {

    private val textPagar = MutableLiveData<String>().apply {
        value = "Pagar total"
    }

    val text: LiveData<String> = textPagar
}