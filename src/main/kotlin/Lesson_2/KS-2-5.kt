package org.example.Lesson_2
import kotlin.math.pow

    const val DEPOSITE: Double = 70000.0

fun main() {
    val yars: Double = 20.0
    val rateBank: Double = 16.7
    val bankRateFactor: Double = 1 + rateBank / 100
    val result: Double = DEPOSITE * bankRateFactor.pow(yars)

    println("%.3f".format(result))
}


