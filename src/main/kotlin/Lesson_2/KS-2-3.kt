package org.example.Lesson_2

fun main() {
    val startTrainInMinutes: Int = 9 * 60 + 39
    val timeOfWayInMinutes = 457
    val arrivalTotalMinutes = startTrainInMinutes + timeOfWayInMinutes
    val remainingMinutes = arrivalTotalMinutes % (24 * 60)
    val finishTimeInHour = remainingMinutes / 60
    val finishTimeInMinutes = remainingMinutes % 60

    println("%02d:%02d".format(finishTimeInHour, finishTimeInMinutes))
}