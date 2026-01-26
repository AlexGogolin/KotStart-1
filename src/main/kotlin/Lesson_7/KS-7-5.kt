package org.example.Lesson_7

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val allChars = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    val password = mutableListOf<Char>()

    password.add(('0'..'9').random())
    password.add(('a'..'z').random())
    password.add(('A'..'Z').random())

    println("Введите длину пароля, минимум 6 символов")
    val passwordLength = readln().toInt()
    if (passwordLength >= 6) {
        for (i in 1..(passwordLength - 3)) {
            password.add(allChars.random())
        }
        println("Ваш пароль: ${password.shuffled().joinToString("")}")
    } else
        println("Ну вас же попросили написать число не менее 6 :(")
}