package org.example.Lessons_1_10.Lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val weigh1 = 20
    val volume1 = 80

    println("Груз с весом $weigh1 кг и объемом $volume1 л" + "соответствует категории 'Average': "
            + ((weigh1 > MIN_WEIGHT && weigh1 <= MAX_WEIGHT) && (volume1 < MAX_VOLUME)))

    val weigh2 = 50
    val volume2 = 100

    println("Груз с весом $weigh1 кг и объемом $volume1 л" + "соответствует категории 'Average': "
            + ((weigh2 > MIN_WEIGHT && weigh2 <= MAX_WEIGHT) && (volume2 < MAX_VOLUME)))
}

