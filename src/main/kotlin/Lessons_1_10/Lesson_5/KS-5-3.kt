package org.example.Lessons_1_10.Lesson_5

const val NUMBER_ONE = 7
const val NUMBER_TWO = 30
fun main(){
    println("Угадайте 2 числа от 0 до 42 и получите приз!")
    println("Напишите первое число:")
    val firstNumber = readln().toInt()
    println("Напишите второе число:")
    val secondNumber = readln().toInt()


    val correctNumberOne = (NUMBER_ONE == firstNumber) || (NUMBER_TWO == firstNumber)
    val correctNumberTwo = (NUMBER_ONE == secondNumber) || (NUMBER_TWO == secondNumber)
    val doubleCorrect = correctNumberOne && correctNumberTwo
    val singleCorrect = correctNumberOne || correctNumberTwo

    if(doubleCorrect)
        println("“Поздравляем! Вы выиграли главный приз!")
    else if (singleCorrect)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}