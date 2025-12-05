package org.example.Lesson_2

    const val HOURS_IN_DAY = 24
    const val MINUTES_IN_HOUR = 60

fun main() {
    val startHours = 9
    val startMinutes = 39
    val startTrainInMinutes: Int = startHours * MINUTES_IN_HOUR + startMinutes
    val timeOfWayInMinutes = 457
    val arrivalTotalMinutes = startTrainInMinutes + timeOfWayInMinutes
    val remainingMinutes = arrivalTotalMinutes % (HOURS_IN_DAY * MINUTES_IN_HOUR)
    val finishTimeInHour = remainingMinutes / MINUTES_IN_HOUR
    val finishTimeInMinutes = remainingMinutes % MINUTES_IN_HOUR

    println("%02d:%02d".format(finishTimeInHour, finishTimeInMinutes))
}