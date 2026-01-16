package org.example.Lesson_4

fun main() {
    val hands = 1
    val legs = 0
    val dayOfTraining = 5
    val dayOfHands: Boolean = (dayOfTraining % 2) == hands
    val dayOfLegs: Boolean = (dayOfTraining % 2) == legs

    println(
        """
            Упражнения для рук: $dayOfHands
            Упражнения для ног:$dayOfLegs
            Упражнения для спины: $dayOfLegs
            Упражнения для пресса: $dayOfHands
        """.trimIndent()
    )
}