package org.example.Lesson_14

const val PI_NUMBER = 3.14

fun main() {
    val listOfFigure = mutableListOf<Figure>()
    val circle1 = Circle("Черный", 32)
    val rectingle1 = Rectingle("Черный", 73, 6)
    val circle2 = Circle("Белый", 36)
    val rectingle2 = Rectingle("Черный", 12, 43)
    val circle3 = Circle("Черный", 14)
    val rectingle3 = Rectingle("Белый", 54, 58)

    listOfFigure.add(circle1)
    listOfFigure.add(rectingle1)
    listOfFigure.add(circle2)
    listOfFigure.add(rectingle2)
    listOfFigure.add(circle3)
    listOfFigure.add(rectingle3)


    val blackPerimeterSum = listOfFigure.filter { it.color == "Черный" }.sumOf { it.calculatePerimeter() }
    val whiteAreaSum = listOfFigure.filter { it.color == "Белый" }.sumOf { it.calculateArea() }

    println("Сумма периметра всех черных фигур $blackPerimeterSum\nПлощадь всех белых фигур: %.2f".format(whiteAreaSum))
}

abstract class Figure(
    open val color: String,
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Rectingle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun calculatePerimeter(): Double {
        return 2 * (height + width).toDouble()
    }

    override fun calculateArea(): Double {
        return width * height.toDouble()
    }
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun calculatePerimeter(): Double {
        return 2 * PI_NUMBER * radius
    }

    override fun calculateArea(): Double {
        return PI_NUMBER * radius * radius
    }
}