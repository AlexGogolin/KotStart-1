package org.example.Lesson_9

const val USER_AGREE = "Да"
fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

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