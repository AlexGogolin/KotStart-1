package org.example.KotLearn_sprint_1

const val secondsInHour: Short = 3600
const val secondsInMinute: Byte = 60

fun main() {
    val totalSeconds: Short = 6480
    val hours: Int = totalSeconds / secondsInHour
    val remaingSeconds: Int = totalSeconds % secondsInHour
    val minutes: Int = remaingSeconds / secondsInMinute
    val seconds: Int = remaingSeconds % secondsInMinute

    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}