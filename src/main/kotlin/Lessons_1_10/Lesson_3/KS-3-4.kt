package org.example.Lessons_1_10.Lesson_3

fun main() {
    var turn = 1
    var turnStartLetter = "E"
    var turnStartNumber = 2
    var turnFinishLetter = "E"
    var turnFinishNumber = 4
    var chessPlace = "$turnStartLetter$turnStartNumber : $turnFinishLetter$turnFinishNumber : $turn"

    println(chessPlace)

    turn = 2
    turnStartLetter = "D"
    turnStartNumber = 2
    turnFinishLetter = "D"
    turnFinishNumber = turnStartNumber + 1

    chessPlace = "$turnStartLetter$turnStartNumber : $turnFinishLetter$turnFinishNumber : $turn"

    println(chessPlace)
}