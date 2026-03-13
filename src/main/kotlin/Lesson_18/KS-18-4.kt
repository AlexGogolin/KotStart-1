package org.example.Lesson_18
import kotlin.math.pow

fun main() {
    val package1 = RectangularBox(12, 13, 5)
    val package2 = CubeBox(15)
    val listOfPackages: List<Package> = listOf(package1, package2)
    listOfPackages.forEach { pkg ->
        println("Площадь равна : ${pkg.calculateArea()}")
    }
}

abstract class Package {
    abstract fun calculateArea(): Int
}

class RectangularBox(
    val width: Int,
    val height: Int,
    val length: Int,
) : Package() {
    override fun calculateArea(): Int {
        return 2 * (length * width + width * height + length * height)
    }
}

class CubeBox(
    val side: Int,
) : Package() {
    override fun calculateArea(): Int {
        return 6 * side * side
    }
}