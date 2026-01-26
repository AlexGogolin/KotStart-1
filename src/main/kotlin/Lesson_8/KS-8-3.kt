package org.example.Lesson_8

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val arrayOfIngridients = arrayOf("мясо", "свекла", "томат", "соль", "перец", "капуста", "лук", "морковь").toList()

    println("Напишите интересующий вас ингредиент: ")
    val searchIngridient = readln().lowercase()

    if (arrayOfIngridients.contains(searchIngridient)) {
        println("Ингредиент $searchIngridient есть в составе этого блюда")
        return
    }
    println("Такого ингредиента в рецепте нет")
}