package org.example.Lesson_10

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    var computerResult = 0
    var manResult = 0

    computerResult += rollDice()
    println("Ход компьютера, результат: $computerResult")
    manResult += rollDice()
    println("Ход игрока, результат: $manResult")

    if (computerResult > manResult) {
        println("Компьютер победил со счетом $computerResult : $manResult")
    } else if (computerResult < manResult) {
        println("Человек победил со счетом $manResult : $computerResult")
    } else {
        println("Ничья!")
    }
}

fun rollDice(): Int {
    val dice = (1..6).random()
    return dice
}