package org.example.Learn_package

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))
    val anyBook = Book(
        title = "Martin Iden",
        author = "London",
    )
    val anyBook2 = Book(
        title = "Mgla",
        author = "King",
    )
    val library = Library()
    val bookInLibrary1 = library.addBook(anyBook)
    val bookInLibrary2 = library.addBook(anyBook2)
    library.takeBook("Martin Iden")


}

class Book(
    val title: String,
    val author: String,
    var isAvailable: Boolean = true,
){

}

class Library(
    var books: MutableList<Book> = mutableListOf(),

    ){
    fun addBook(book: Book) {
        books.add(book)
    }
    fun takeBook(title: String) {
        val foundBook = books.find { it.title == title }
        if (foundBook == null) {
            println("Такой книги в нашей библиотеке нет")
        }else if(!foundBook.isAvailable){
            println("Книга ${foundBook.title} уже кем-то занята")
        }else{
            foundBook.isAvailable = false
            println("Вы успешно взяли книгу: ${foundBook.title}")
        }
    }
}