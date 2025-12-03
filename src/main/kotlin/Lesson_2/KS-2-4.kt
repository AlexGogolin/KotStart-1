package org.example.Lesson_2

fun main() {
    val ironOre: Byte = 11
    val crystalOre: Byte = 7
    val buff: Byte = 20
    val bonusExtractionIron: Int = (ironOre * buff) / 100
    val bonusExtractionCrystal: Int = (crystalOre * buff ) / 100

    println("Железная руда: $bonusExtractionIron")
    println("Кристальная руда: $bonusExtractionCrystal")
}