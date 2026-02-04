package org.example.Lessons_1_10.Lesson_8

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val arrayOfIngredients = arrayOf("мясо", "свекла", "томат", "соль", "перец", "капуста", "лук", "морковь")

    println("Напишите интересующий вас ингредиент: ")
    val searchIngridient = readln().lowercase()

    if (searchIngridient in arrayOfIngredients) {
        println("Ингредиент $searchIngridient есть в составе этого блюда")
        return
    }
    println("Такого ингредиента в рецепте нет")
}