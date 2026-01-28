package org.example.Lesson_9

fun main() {

    println("Пожалуйста введите 5 ингредиентов чтобы они были отделены запятой с пробелом ( “, ” ): ")
    val userIngredients = readln()
    val listOfUserIngredients = userIngredients.split(", ")
    println(listOfUserIngredients)
    val filteredListOfUserIngredients = listOfUserIngredients.sorted()

    println(filteredListOfUserIngredients)
}