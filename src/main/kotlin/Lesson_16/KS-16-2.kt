package org.example.Lesson_16

import kotlin.math.pow

const val PI: Double = 3.14
fun main() {

    val figure = Circle(312)

    println(figure.calculatePerimeter().toFloat())
    println(figure.calculateArea().toFloat())
}


class Circle(
    private val radius: Int,
) {
    fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius.toDouble().pow(2)
    }
}