package org.example.Lessons_1_10.Lesson_10

fun main() {

    println("Какой длины пароль вам необходим?")
    val passwordLenght = readln().toInt()
    println("Ваш пароль : ${passwordGenerator(passwordLenght)} ")
}

fun passwordGenerator(length: Int): String {
    val listOfNumbers = 0..9
    val listOfSimbols = listOf('!', '"', '#', '$', '%', '&', "'", '(', ')', '*', '+', ',', '-', '.', '/')
    var password = ""

    for (i in 1..length) {
        if (i % 2 == 0) {
            password += listOfSimbols.random()
        } else {
            password += listOfNumbers.random()
        }
    }
    return password
}