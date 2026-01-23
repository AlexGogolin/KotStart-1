package org.example.Lesson_6

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    var turn = 3

    do {
        val numberOne = (1..9).random()
        val numberTwo = (1..9).random()
        val correctAnswer = numberOne + numberTwo
        println("Докажите что вы не бот, решите правильно пример: $numberOne + $numberTwo = ? осталось попыток: ${turn--}")
        val userAnswer = readln().toInt()
        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            return
        }
    } while (turn > 0)

    println("Доступ запрещен!")
}