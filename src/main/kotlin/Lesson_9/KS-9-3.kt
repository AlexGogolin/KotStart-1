package org.example.Lesson_9

fun main() {

    val listOfIngredients = listOf(2, 50, 15)
    println("Сколько порций вы хотели бы приготовить?")
    val userAnswer = readln().toInt()

    val ingerientsForPersons = listOfIngredients.map {
        it * userAnswer
    }

    println("Для приготовления $userAnswer порций, вам понадобится: Яйца - ${ingerientsForPersons[0]} шт., Молоко - ${ingerientsForPersons[1]} мл., Сливочное масло - ${ingerientsForPersons[2]} гр.")
}