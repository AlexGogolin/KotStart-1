package org.example.Lesson_15

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val inventory = listOf(
        MusicalInstrument("Гитара Fender", 5),
        Accessory("Струны для гитары", 50),
        MusicalInstrument("Синтезатор Roland", 2)
    )

    inventory.forEach { item ->
        println(" Товар ${item.nameOfProduct} , остаток на складе ${item.quantityInStorage}")
        if (item is Search) {
            item.searching(item.nameOfProduct)
        }
    }
}

open class StoreItem(
    val nameOfProduct: String,
    val quantityInStorage: Int,
)

class MusicalInstrument(
    nameOfProduct: String, quantityInStorage: Int
) : Search, StoreItem(nameOfProduct, quantityInStorage)

class Accessory(
    nameOfProduct: String, quantityInStorage: Int
) : StoreItem(nameOfProduct, quantityInStorage)

interface Search {
    fun searching(name: String) {
        println("Выполняется поиск комплектующих для $name ")
    }
}