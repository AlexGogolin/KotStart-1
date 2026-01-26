package org.example.Lesson_8

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, false, "UTF-8"))

    val arrayOfIngredients = arrayOf("булка", "котлета", "огурец", "лук", "сыр", "кетчуп", "майонез", "горчица")
    println("Состав бургера: ${arrayOfIngredients.joinToString(", ")}")
    println("Какой ингридиент вы хотели бы заменить?")

    val userIngredient = readln().lowercase()
    if (!arrayOfIngredients.contains(userIngredient)) {
        println("Этого ингридиента и так нет в составе!")
    } else {
        println("На какой ингредиент вы хотели бы его заменить?")
        val indexIngredient = arrayOfIngredients.indexOf(userIngredient)
        arrayOfIngredients[indexIngredient] = readln().lowercase()
        println("Теперь в вашем бургере: ${arrayOfIngredients.joinToString(", ")}")
    }
}