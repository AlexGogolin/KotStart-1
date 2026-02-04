package org.example.Lessons_1_10.Lesson_4

fun main() {
    val hands = 1
    val dayOfTraining = 5
    val dayOfHands: Boolean = (dayOfTraining % 2) == hands

    println(
        """
            Упражнения для рук: ${dayOfHands}
            Упражнения для ног:${!dayOfHands}
            Упражнения для спины: ${!dayOfHands}
            Упражнения для пресса: $dayOfHands
        """.trimIndent()
    )
}