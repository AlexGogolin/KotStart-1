package org.example.Lesson_18

fun main() {

    val dice1: Dice = Tetrahedron()
    val dice2: Dice = Hexagon()
    val dice3: Dice = Octahedron()

    val listOfDices: List<Dice> = listOf(dice1, dice2, dice3)
    listOfDices.forEach {
        it.rollOfDice()
    }
}

abstract class Dice {
    abstract val facesCount: Int
    fun rollOfDice() {
        println("Кубик брошен, выпало ${(1..facesCount).random()}")
    }
}

class Tetrahedron(
    override val facesCount: Int = 4,
) : Dice()

class Hexagon(
    override val facesCount: Int = 6,
) : Dice()

class Octahedron(
    override val facesCount: Int = 8,
) : Dice()