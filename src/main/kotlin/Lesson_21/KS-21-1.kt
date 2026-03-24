package org.example.Lesson_21

fun main() {
    val greetings = "Hallo"
    println(greetings.vowelCount())
}

fun String.vowelCount(): Int {
    return this.count { it.lowercaseChar() in "aeiouy" }
}