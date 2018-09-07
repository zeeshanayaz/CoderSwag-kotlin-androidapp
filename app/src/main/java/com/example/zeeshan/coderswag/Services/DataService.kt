package com.example.zeeshan.coderswag.Services

import com.example.zeeshan.coderswag.Model.Category
import com.example.zeeshan.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat SnapBack", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$20", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$20", "hoodie03"),
            Product("Devslopes Black Hoodie", "$20", "hoodie04")
    )

    val shirt = listOf(
            Product("Devslopes Shirt Black", "$20", "shirt01"),
            Product("Devslopes Badge Light Gray", "$32", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$20", "shirt03"),
            Product("Devslopes Hustle", "$22", "shirt04"),
            Product("Kickflip Studio", "$18", "shirt05")
    )
}