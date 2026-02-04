package org.example.Lessons_1_10.Lesson_2

fun main() {
    val buff: Byte = 20
    val ironOre: Byte = 11
    val crystalOre: Byte = 7
    val bonusExtractionIron: Int = (ironOre * buff) / 100
    val bonusExtractionCrystal: Int = (crystalOre * buff ) / 100

    println("Железная руда: $bonusExtractionIron")
    println("Кристальная руда: $bonusExtractionCrystal")
}