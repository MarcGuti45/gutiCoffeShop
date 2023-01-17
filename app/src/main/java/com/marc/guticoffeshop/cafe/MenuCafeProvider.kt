package com.marc.guticoffeshop.cafe

import com.marc.guticoffeshop.menjar.Menjar

class MenuCafeProvider {
    companion object{
        val cafeList = listOf<Cafe>(
            Cafe(
                "Café sol",
                1,
                "https://www.rinconqr.com/wp-content/uploads/rpress/2020/05/unnamed.png"
            ),
            Cafe(
                "Café amb llet",
                1,
                "https://cafesjayza.com/wp-content/uploads/2021/01/taza-cafe-con-leche11.png"
            ),
            Cafe(
                "Capuchino",
                3,
                "https://kayroma.mx/wp-content/uploads/2020/11/noGB_CapuccinoConSabor-ancho.png"
            ),
            Cafe(
                "Café amb gel",
                1,
                "https://www.starbucksathome.com/es/sites/default/files/2021-06/2-IcedLatte_LongShadow_Cream.png"
            ),
            Cafe(
                "Café irlandés",
                2,
                "https://lalicorera.com/img/cocktails/Cafe-irlandees.png"
            )
        )
    }
}