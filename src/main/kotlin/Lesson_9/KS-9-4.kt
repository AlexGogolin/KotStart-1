package org.example.Lesson_9

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    println("Пожалуйста введите 5 ингредиентов чтобы они были отделены запятой с пробелом ( “, ” ): ")
    val userIngredients = readln()
    val listOfUserIngredients = userIngredients.split(", ")
    println(listOfUserIngredients)
    val filteredListOfUserIngredients = listOfUserIngredients.sorted()

    println(filteredListOfUserIngredients)
}