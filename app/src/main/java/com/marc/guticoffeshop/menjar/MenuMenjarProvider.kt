package com.marc.guticoffeshop.menjar


class MenuMenjarProvider {
    companion object{
        val menjarList = listOf<Menjar>(
            Menjar(
                "Croissant",
                1,
                "https://www.panidor.pt/zArchives/Products/115/Photos/croissant-bake-ovo_ref144026%20copy.png?w=700&h=400&mode=pad"
            ),
            Menjar(
                "Donut",
                1,
                "https://live-aroma-joes-2020.imgix.net/wp-content/uploads/2021/01/Glazed-Donut.png?q=85&fit=crop&crop=faces&auto=format"
            ),
            Menjar(
                "Entrepà",
                3,
                "https://barrestauranteateneo.com/images/bocadillosytapas/Ateneo-bocadillo-jamon.png"
            ),
            Menjar(
                "Palmera Xocolata",
                2,
                "https://www.mercadum.es/720-large_default/palmera-de-chocolate.jpg"
            ),
            Menjar(
                "Crepes",
                4,
                "https://images.eatself.com/1175/Products_111941_CREPE%20NUTELLA.png"
            )
        )
    }
}