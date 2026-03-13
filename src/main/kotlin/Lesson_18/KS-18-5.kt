package org.example.Lesson_18

fun main() {
    val figure1 = Screen()
    println(figure1.drawCircle(10, 15))
    println(figure1.drawCircle(10.5f, 15.6f))
    println(figure1.drawSquare(9f, 15.4f))
    println(figure1.drawSquare(7, 16))
    println(figure1.drawPoint(17.4f, 15.4f))
    println(figure1.drawPoint(18, 12))
}

class Screen {
    fun drawCircle(x: Int, y: Int): String {
        return "Круг нарисован в координатах ($x, $y)"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Круг нарисован в координатах ($x, $y)"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Квадрат нарисован в координатах ($x, $y)"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Квадрат нарисован в координатах ($x, $y)"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Точка нарисована в координатах ($x, $y)"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Точка нарисована в координатах ($x, $y)"
    }
}