package org.example.Lesson_22

fun main() {
    val book1 = RegularBook("The Lord of the Rings", "Tolkien")
    val book2 = RegularBook("The Lord of the Rings", "Tolkien")

    val book3 = DataBook("The Lord of the Rings", "Tolkien")
    val book4 = DataBook("The Lord of the Rings", "Tolkien")

    println(book1 == book2)
    println(book3 == book4)

    //У обычного класса получается неравенство из-за того, что сравниваются ссылки на объекты, а не значения этих объектов.
    // А так как book1 и book2 это два разных объекта, то и ссылки на ячеки памяти разные
    // А дата класс сравнивает данные в объектах, так как насколько я понял "под капотом" стандартная функция equals() изменена,
    // на более глубокое сравнение именно значений
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)