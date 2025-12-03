package org.example.KotLearn_sprint_1

const val secondsInHour: Short = 3600
const val secondsInMinutes: Byte = 60

fun main() {
    val totalSeconds: Short = 6480
    val hours: Int = totalSeconds / secondsInHour
    val remaingSeconds: Int = totalSeconds % secondsInHour
    val minutes: Int = remaingSeconds / secondsInMinutes
    val seconds: Int = remaingSeconds % secondsInMinutes

    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}