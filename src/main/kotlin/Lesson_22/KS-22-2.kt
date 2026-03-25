package org.example.Lesson_22

fun main() {
    val book1 = BookRegular("Brave New World", "Aldous Huxley")
    val book2 = BookData("Brave New World", "Aldous Huxley")

    println(book1)
    println(book2)

    //Разница в том что по умолчанию в data классе функция toString переопределена, по типу:
    // override fun toString(): String { return "BookRegular(name='$name', author='$author')"}
    // Data class переопределяет по умолчанию все методы, но использует только поля в конструкторе
    // А у обычного класса метод toString стандартный который выводит только название класса и 16-ти ричное представление хешкода объекта
}

class BookRegular(
    val name: String,
    val author: String,
)

data class BookData(
    val name: String,
    val author: String,
)