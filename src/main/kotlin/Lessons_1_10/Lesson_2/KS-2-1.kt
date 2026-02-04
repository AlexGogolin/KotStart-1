package org.example.Lessons_1_10.Lesson_2

fun main() {
    val numberOfStudents = 4
    val studentScore_1: Byte = 3
    val studentScore_2: Byte = 4
    val studentScore_3: Byte = 3
    val studentScore_4: Byte = 5
    val sumStudentsScore: Int = studentScore_1 + studentScore_2 + studentScore_3 + studentScore_4
    val averageScore: Float = sumStudentsScore.toFloat() / numberOfStudents

    println(averageScore)
}