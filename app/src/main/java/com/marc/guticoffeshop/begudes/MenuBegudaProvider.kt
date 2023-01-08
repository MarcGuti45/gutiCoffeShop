package com.marc.guticoffeshop.begudes


class MenuBegudaProvider {
    companion object{
        val begudaList = listOf<Begudes>(
            Begudes(
                "Coca-Cola",
                2,
                "https://s4d-images.telepizza.es/Products/Original/Coca-Cola_Original_1L_-2535.png"
            ),
            Begudes(
                "Fanta",
                2,
                "https://dragonimperial.es/wp-content/uploads/2018/08/Fanta-naranja.png"
            ),
            Begudes(
                "Nestea",
                2,
                "https://sportavern.com/wp-content/uploads/productosImgs2Fbebida-nestea-33cl2.png"
            ),
            Begudes(
                "Aigua Mineral",
                1,
                "https://i0.wp.com/frankfurtsantaanna.com/wp-content/uploads/2021/09/Agua.jpg?fit=1240%2C1240&ssl=1"
            ),
            Begudes(
                "Suc natural",
                3,
                "https://www.zuvamesa.com/imagenes/img-zumo-naranja-1.png"
            )
        )
    }
}