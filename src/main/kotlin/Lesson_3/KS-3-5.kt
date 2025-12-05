package org.example.Lesson_3

fun main() {
    val turn = "D2-D4;0"
    val turnStart = turn.substring(0..1)
    val turnFinish = turn.substring(3..4)
    val turnNumber = turn[6]

    println(turnStart)
    println(turnFinish)
    println(turnNumber)
}