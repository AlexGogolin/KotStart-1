package org.example.Lesson_2
import kotlin.math.pow

fun main() {
    var deposite: Double = 70000.0
    val yars: Double = 20.0
    val rateBank: Double = 16.7
    val bankRateFactor: Double = 1 + rateBank / 100
    val result: Double = deposite * bankRateFactor.pow(yars)

    println("%.3f".format(result))
}


