package org.example.Lesson_5

fun main() {
    val numberOne = 2
    val numbertwo = 3
    val example = "Чему равно: $numberOne + $numbertwo ?"
    val correctAnswer = numberOne + numbertwo

    println("Докажите что вы не бот и решите пример. $example")
    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен!!")
}