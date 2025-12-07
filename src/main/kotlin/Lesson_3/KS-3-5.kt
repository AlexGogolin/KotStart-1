package org.example.Lesson_3

fun main() {
    val turn = "D2-D4;0"
    val partsOfString = turn.split('-', ';')

    val turnStart = partsOfString[0]
    val turnFinish = partsOfString[1]
    val turnNumber = partsOfString[2]

    println(turnStart)
    println(turnFinish)
    println(turnNumber)
}