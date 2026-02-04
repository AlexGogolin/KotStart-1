package org.example.Lessons_1_10.Lesson_5

const val CENTIMETERS_PER_METER = 100
fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    println("Напишите ваш рост в сантиметрах:")
    val userHeight = readln().toFloat()
    println("Напишите ваш вес:")
    val userWeight = readln().toFloat()

    val userHeightInMeters = userHeight / CENTIMETERS_PER_METER
    val imt = userWeight / (userHeightInMeters * userHeightInMeters)

    val imtResult = when {
        imt < 18.5 -> println("Недостаточная масса тела")
        imt < 25 -> println("Нормальная масса тела")
        imt < 30 -> println("Избыточная масса тела")
        else -> println("Избыточная масса тела")
    }
    println("Ваш ИМТ равен: ${"%.2f".format(imt)}, у вас $imtResult")
}