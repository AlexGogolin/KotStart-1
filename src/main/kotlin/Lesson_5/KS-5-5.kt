package org.example.Lesson_5

fun main() {
    val winNumbers = (0..42).shuffled().take(3)
    val listOfNumbers = mutableListOf<Int>()
    println(winNumbers)
    println("Введите 3 числа для лотереи (от 0 до 42):")

    println("Введите первое число:")
    val numberOne = readln().toInt()
    listOfNumbers.add(numberOne)

    println("Введите второе число:")
    val numberTwo = readln().toInt()
    listOfNumbers.add(numberTwo)

    println("Введите третье число:")
    val numberThree = readln().toInt()
    listOfNumbers.add(numberThree)

    val matchingNumbers = listOfNumbers.intersect(winNumbers)
    val result = matchingNumbers.size
    when(result) {
        3 -> println("Вы сорвали Джекпот!!!")
        2 -> println("Вы получаете автомобиль!!")
        1 -> println("Получаете скидку на Кинопоиск!")
        else -> println("К сожалению вы ничего не выиграли")
    }
    println("Выиграшные числа: $winNumbers")
}