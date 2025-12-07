package org.example.Lesson_4

fun main() {
    val sunWeather: Boolean = true
    val openTent: Boolean = true
    val humidity: Int = 20
    val season = "зима"
    val favorableСonditions: Boolean = sunWeather && openTent && (humidity == 20) && (season != "зима")

    println("“Благоприятные ли условия сейчас для роста бобовых? $favorableСonditions")
}