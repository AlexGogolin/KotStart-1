package org.example.Lessons_1_10.Lesson_4

const val SUN_WEATHER: Boolean = true
const val OPEN_TENT: Boolean = true
const val HUMIDITY: Int = 20
const val WRONG_SEASON = "зима"
fun main() {
    val weatherSun: Boolean = true
    val tentIsOpen: Boolean = true
    val whatHumidity: Int = 20
    val season = "зима"
    val favorableСonditions: Boolean = (SUN_WEATHER == weatherSun) && (OPEN_TENT == tentIsOpen) && (HUMIDITY == whatHumidity) && (season != WRONG_SEASON)

    println("“Благоприятные ли условия сейчас для роста бобовых? $favorableСonditions")
}