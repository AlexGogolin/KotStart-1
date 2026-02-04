package org.example.Lessons_1_10.Lesson_10
const val USER_AGREE = "Да"

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    var round = 1
    var totalManWins = 0
    do{
        println("Раунд №$round")
        totalManWins += _root_ide_package_.org.example.Lessons_1_10.Lesson_10.resultOneGame()
        println("Хотите еще один раунд?")
        val userAnswer = readln()
        round++
    }while (_root_ide_package_.org.example.Lessons_1_10.Lesson_10.USER_AGREE.equals(userAnswer, ignoreCase = true))
    println("Игра завершена вы выиграли: $totalManWins раза")
}

fun rollDice(): Int {
    val dice = (1..6).random()
    return dice
}

fun resultOneGame() : Int{
    var computerDiceResult = 0
    var manDiceResult = 0
    var turn = 1
    var manGameResult = 0

    while (turn <= 2) {
        if (turn % 2 == 0) {
            computerDiceResult += _root_ide_package_.org.example.Lessons_1_10.Lesson_10.rollDice()
        } else {
            manDiceResult += _root_ide_package_.org.example.Lessons_1_10.Lesson_10.rollDice()
        }
        turn++
    }

    if (computerDiceResult > manDiceResult) {
        println("Победил компьютер со счетом $computerDiceResult : $manDiceResult")
    } else if(computerDiceResult < manDiceResult) {
        println("Победил человек со счетом $manDiceResult : $computerDiceResult")
        manGameResult += 1
    } else{
        println("Ничья : $manDiceResult : $computerDiceResult")
    }
    return manGameResult
}