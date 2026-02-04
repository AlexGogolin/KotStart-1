package org.example.Lessons_1_10.Lesson_8

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, false, "UTF-8"))

    println("Сколько ингредиентов необходимо для приготовления блюда?")
    val arrayLength = readln().toInt()
    val ingredients = Array(arrayLength) { "" }

    for (i in ingredients.indices) {
        println("Какой ингредиент №${i + 1} вы хотели бы добавить?")
        ingredients[i] = readln()
    }
    println("${ingredients.joinToString(", ")}")
}