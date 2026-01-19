package org.example.Lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOX_OF_FOOD = 50
const val HAS_DAMAGE = true
const val GOOD_WEATHER = true
fun main() {
    val damage = readln().toBoolean()
    val isDamage = damage == HAS_DAMAGE
    val crew = readln().toInt()
    val boxOfFood = readln().toInt()
    val weather = readln().toBoolean()
    val isGoodWeather = weather == GOOD_WEATHER

    val sheepStartRecomendet = !isDamage && (crew >= MIN_CREW && crew <= MAX_CREW) && (boxOfFood > MIN_BOX_OF_FOOD)
    val sheepStartAlternative = (crew == MAX_CREW) && isGoodWeather && (boxOfFood >= MIN_BOX_OF_FOOD)
    val sheepStart = sheepStartRecomendet || sheepStartAlternative

    println(sheepStart)
}