package org.example.Lesson_20

fun main() {

    val list: List<String> = listOf("btn1", "btn2", "btn3", "btn4", "btn5", "btn6", "btn7", "btn8")

    val listOfActions = list.map { buttonName -> { println("Нажата кнопка $buttonName") } }

    listOfActions.forEachIndexed { index, element ->
        if (index % 2 == 0) {
            element()
        }
    }
}

