package org.example.Lesson_8

import kotlin.collections.intersect

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val arrayOfIngridients = arrayOf("мясо", "свекла", "томат", "соль", "перец", "капуста", "лук", "морковь")

    println("Напишите интересующий вас ингридиент: ")
    val searchIngridient = readln().lowercase()

    for (i in arrayOfIngridients) {
        if (i == searchIngridient) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}