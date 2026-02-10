package org.example.Lesson_13


import java.io.PrintStream

fun main(){
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val phoneBook = listOf(
        AnotherUserStorage2("Bob", 85461238L, "Google"),
        AnotherUserStorage2("Ruby", 85255238L),
        AnotherUserStorage2("Jack", 85456588L, "Yandex"),
        AnotherUserStorage2("Patrick", 82156228L, "null"),
        AnotherUserStorage2("Anna", 88761256L),
        )

    val listOfCompany = phoneBook.map{ it.company }.filterNotNull()
    println(listOfCompany)
}

class AnotherUserStorage2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
){
}