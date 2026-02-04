package org.example.Lessons_1_10.Lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("булка", "котлета", "огурец", "лук", "сыр", "кетчуп", "майонез", "горчица")
    println("Состав бургера: ${arrayOfIngredients.joinToString(", ")}")
    println("Какой ингредиент вы хотели бы заменить?")

    val userIngredient = readln().lowercase()
    val indexIngredient = arrayOfIngredients.indexOf(userIngredient)

    if (indexIngredient >= 0) {
        println("На какой ингредиент вы хотели бы его заменить?")
        arrayOfIngredients[indexIngredient] = readln().lowercase()
        println("Теперь в вашем бургере: ${arrayOfIngredients.joinToString(", ")}")
    } else {
        println("Этого ингредиента и так нет в составе!")
    }
}