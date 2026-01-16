package org.example.Lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOX_OF_FOOD = 50
fun main() {
    val nodamage = readln().toBoolean()
    val crew = readln().toInt()
    val boxOfFood = readln().toInt()
    val goodWeather = readln().toBoolean()

    val sheepStartRecomendet = nodamage && (crew >= MIN_CREW && crew <= MAX_CREW) && (boxOfFood > MIN_BOX_OF_FOOD)
    val sheepStartAlternative = (crew == MAX_CREW) && goodWeather && (boxOfFood >= MIN_BOX_OF_FOOD)
    val sheepStart = sheepStartRecomendet || sheepStartAlternative

    println(sheepStart)
}