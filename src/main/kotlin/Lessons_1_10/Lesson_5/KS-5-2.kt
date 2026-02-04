package org.example.Lessons_1_10.Lesson_5

const val CURRENT_AGE = 18

fun main() {
    val userAge = readln().toInt()
    val age = (2026 - userAge)
    if(age >= CURRENT_AGE) {
        println("Показать экран со скрытым контентом")
    }
}