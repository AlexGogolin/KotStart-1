package org.example.Lessons_1_10.Lesson_10

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    var computerResult = 0
    var manResult = 0

    computerResult += roll()
    println("Ход компьютера, результат: $computerResult")
    manResult += roll()
    println("Ход игрока, результат: $manResult")

    if (computerResult > manResult) {
        println("Компьютер победил со счетом $computerResult : $manResult")
    } else if (computerResult < manResult) {
        println("Человек победил со счетом $manResult : $computerResult")
    } else {
        println("Ничья!")
    }
}

fun roll(): Int {
    val dice = (1..6).random()
    return dice
}