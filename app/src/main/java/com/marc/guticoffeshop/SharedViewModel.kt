package com.marc.guticoffeshop

class SharedViewModel {
    companion object{
        val listOfCaffes: ArrayList<String> = ArrayList()
        val listOfPrices: ArrayList<Int> = ArrayList()
        fun sumTotal(): Int {
            return listOfPrices.sum()
        }
    }
}