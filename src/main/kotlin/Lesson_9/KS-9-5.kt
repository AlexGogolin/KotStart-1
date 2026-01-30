package org.example.Lesson_9

import kotlin.text.equals

fun main() {

    val listOfIngredients = mutableSetOf<String>()

    println("Введите 5 ингредиентов для вашего блюда: ")
    while (listOfIngredients.size < 5) {
        println("Напишите ингредиент №${listOfIngredients.size + 1}:")
        val userAnswer = readln().lowercase()
        if (!listOfIngredients.add(userAnswer)) {
            println("Ошибка! $userAnswer уже есть в списке. Ваш список сейчас $listOfIngredients")
        }
    }

    val filteredListOfUserIngredients = listOfIngredients.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }
    println(filteredListOfUserIngredients)
}

