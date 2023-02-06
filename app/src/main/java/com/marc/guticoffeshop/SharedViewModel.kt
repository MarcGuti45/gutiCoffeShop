package com.marc.guticoffeshop

class SharedViewModel {
    companion object{
        val llistaCafes: ArrayList<String> = ArrayList()
        val llistaPreus: ArrayList<Int> = ArrayList()
        fun sumaTotal(): Int {
            return llistaPreus.sum()
        }
    }
}