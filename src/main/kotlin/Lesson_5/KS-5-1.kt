package org.example.Lesson_5

fun main() {
    val example = "Чему равно: 2 + 2 ?"
    val correctAnswer = 4

    println("Докажите что вы не бот и решите пример. $example")
    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен!!")
}