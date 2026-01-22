package org.example.Lesson_6

fun main(){
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val range = 1..9
    val winNumber = range.random()
    var turn = 5
    var attempt = 1

    println("Угадайте число от 1 до 9, у вас есть 5 попыток")
    do {
        println("Попытка №$attempt, введите число:")
        val userNumber = readln().toInt()
        if(winNumber == userNumber){
            println("Это была великолепная игра! Вы угадали за $attempt попыток ")
            return
        }else{
            turn--
            println("Неверно, попыток осталось $turn")
            attempt++
        }
    }while(turn > 0)
    println("К сожалению вы проиграли:( Было загадано число $winNumber. Попробуйте снова")
}