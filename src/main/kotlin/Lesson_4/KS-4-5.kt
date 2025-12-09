package org.example.Lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOX_OF_FOOD = 50
fun main() {
    val damage: Boolean = false
    val crew = 60
    val boxOfFood = 70
    val goodWeather: Boolean = false

    val sheepStartRecomendet =
        !damage && (crew >= MIN_CREW && crew <= MAX_CREW) && (boxOfFood > MIN_BOX_OF_FOOD) && (goodWeather || !goodWeather)
    val sheepStartAlternative = (crew == MAX_CREW) && (boxOfFood >= MIN_BOX_OF_FOOD) && goodWeather
    val sheepStart = sheepStartRecomendet || sheepStartAlternative

    println(sheepStart)
}