package org.example.Lesson_4

fun main() {
    val hands = 1
    val legs = 0
    val day = 1
    val dayOfHands: Boolean = (day % 2) == hands
    val dayOfLegs: Boolean = (day % 2) == legs

    println(
        """
            Упражнения для рук: $dayOfHands
            Упражнения для ног:$dayOfLegs
            Упражнения для спины: $dayOfLegs
            Упражнения для пресса: $dayOfHands
        """.trimIndent()
    )
}