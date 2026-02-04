package org.example.Lessons_1_10.Lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOX_OF_FOOD = 50
const val NO_DAMAGE = false
const val GOOD_WEATHER = true
fun main() {
    val isdamage = readln().toBoolean()
    val crew = readln().toInt()
    val boxOfFood = readln().toInt()
    val weather = readln().toBoolean()

    val sheepStartRecomendet = (isdamage == NO_DAMAGE) && (crew >= MIN_CREW && crew <= MAX_CREW) && (boxOfFood > MIN_BOX_OF_FOOD)
    val sheepStartAlternative = (crew == MAX_CREW) && (weather == GOOD_WEATHER) && (boxOfFood >= MIN_BOX_OF_FOOD)
    val sheepStart = sheepStartRecomendet || sheepStartAlternative

    println(sheepStart)
}