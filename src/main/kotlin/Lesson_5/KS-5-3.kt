package org.example.Lesson_5

const val NUMBER_ONE = 7
const val NUMBER_TWO = 30
fun main(){
    println("Угадайте 2 числа от 0 до 42 и получите приз!")
    println("Напишите первое число:")
    val firstNumber = readln().toInt()
    println("Напишите второе число:")
    val secondNumber = readln().toInt()

    if((NUMBER_ONE + NUMBER_TWO) == (firstNumber + secondNumber))
        println("“Поздравляем! Вы выиграли главный приз!")
    else if ((NUMBER_ONE == firstNumber) || NUMBER_ONE == secondNumber)
        println("Вы выиграли утешительный приз!")
    else if ((NUMBER_TWO == firstNumber) || NUMBER_TWO == secondNumber)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}