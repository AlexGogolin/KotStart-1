package org.example.Lesson_21

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7 , 8 , 9)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    val sum = filter { it % 2 == 0 }.sum()
    return sum
}