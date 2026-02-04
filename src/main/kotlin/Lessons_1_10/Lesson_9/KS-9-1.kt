package org.example.Lessons_1_10.Lesson_9

fun main() {

    val listOfIngredients =
        listOf("айсберг", "креветки", "авокадо", "йогурт", "руккола", "оливковое масло", "соль", "перец")

    println("В рецепте есть следующие ингредиенты: $listOfIngredients")
    listOfIngredients.forEach {
        println(it)
    }
}