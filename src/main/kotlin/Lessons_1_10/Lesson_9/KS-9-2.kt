package org.example.Lessons_1_10.Lesson_9

const val USER_AGREE = "Да"
fun main() {

    val baseIngredients = mutableListOf("мясо", "картофель", "грибы")
    println("В рецепте есть базовые ингредиенты:$baseIngredients")

    println("Хотели бы добавить что-то еще?")
    val questionOfIngredient = readln()

    val matchAnswer = questionOfIngredient.equals(USER_AGREE, true)
    if (matchAnswer) {
        println("Какой ингредиент вы хотели бы добавить?")
        val answerOfIngredient = readln()
        baseIngredients.add(answerOfIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $baseIngredients")
    }
}