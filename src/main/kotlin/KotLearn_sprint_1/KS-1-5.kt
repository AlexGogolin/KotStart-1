package org.example.KotLearn_sprint_1

fun main() {
    val totalSeconds: Short = 6480
    val hours: Int = totalSeconds / 3600
    val remainSecondsWidthHourse: Int = totalSeconds % 3600
    val minutes: Int = remainSecondsWidthHourse / 60
    val seconds: Int = remainSecondsWidthHourse % 60

    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}