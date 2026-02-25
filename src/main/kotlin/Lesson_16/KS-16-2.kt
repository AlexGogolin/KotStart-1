package org.example.Lesson_16


fun main() {

    val figure = Circle(312)

    println(figure.calculatePerimeter().toFloat())
    println(figure.calculateArea().toFloat())
}


class Circle(
    private val radius: Int,
) {
    private val PI: Double = 3.14

    fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius * radius
    }
}