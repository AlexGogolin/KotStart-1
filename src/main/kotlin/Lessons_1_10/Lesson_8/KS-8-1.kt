package org.example.Lessons_1_10.Lesson_8

import java.util.Arrays

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val viewsArray = arrayOf(34, 52, 16, 24, 72, 31, 64)
    var sum = 0
    for (i in viewsArray) {
        sum += i
    }
    println("Просмотров за неделю $sum")
}