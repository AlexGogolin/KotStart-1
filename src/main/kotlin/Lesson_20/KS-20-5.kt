package org.example.Lesson_20

fun main() {
    val bender = Robot()

    bender.say()
    bender.setModifier { it.reversed() }
    bender.say()

}

class Robot {
    val phrases: List<String> = listOf(
        "Здарова кожанный",
        "Сравните свою жизнь с моей, а потом убейте себя!",
        "Позеры! Я ненавидел Зойдберга еще до того, как это стало модным.",
        "Куда подевался Фрай?",
        "Я люблю вас, мешки с костями"
    )
    var speechModifier: (String) -> String = { it }
    val randomPhrase = phrases.random()
    fun say() {
        println(speechModifier(randomPhrase))
    }

    fun setModifier(modifer: (String) -> String) {
        speechModifier = modifer
    }
}