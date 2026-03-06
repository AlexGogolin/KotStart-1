package org.example.Lesson_17

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))
    val quiz1 = Quiz("Каков ответ на главный вопрос жизни, вселенной и всего такого?", "41")

    println(quiz1.question)
    println(quiz1.answer)

    quiz1.answer = "Ошибся, правильно 42"

    println(quiz1.answer)
}

class Quiz(
    val questionPrimary: String,
    val answerPrimary: String,
) {
    var question: String = questionPrimary
        get() = field

    var answer: String = answerPrimary
        get() = field
        set(value) {
            field = value
        }

}