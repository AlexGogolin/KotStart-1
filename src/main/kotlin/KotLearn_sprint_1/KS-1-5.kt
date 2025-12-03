package org.example.KotLearn_sprint_1

const val SECONDS_IN_HOUR: Short = 3600
const val SECONDS_IN_MINUTES: Byte = 60

fun main() {
    val totalSeconds: Short = 6480
    val hours: Int = totalSeconds / SECONDS_IN_HOUR
    val remaingSeconds: Int = totalSeconds % SECONDS_IN_HOUR
    val minutes: Int = remaingSeconds / SECONDS_IN_MINUTES
    val seconds: Int = remaingSeconds % SECONDS_IN_MINUTES

    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}