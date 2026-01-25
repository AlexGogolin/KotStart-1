package org.example.Lesson_7

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    var password: String = ""
    val intRange = 1..10
    val charRange = 'a'..'z'
    for (i in 1..6) {
        if (i % 2 == 0) {
            password += intRange.random().toString()
        } else {
            password += charRange.random()
        }
    }
    println(password)
}