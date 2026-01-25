package org.example.Lesson_7

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    println("Пожалуйста введите число:")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2) {
        println(i)
    }
}