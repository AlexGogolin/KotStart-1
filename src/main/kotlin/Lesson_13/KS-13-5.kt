package org.example.Lesson_13

fun main() {

    println("Введите имя:")
    val name = readln()
    println("Введите номер телефона:")
    var phoneNumber: Long? = null

    try {
        phoneNumber = readln().toLong()
    } catch (e: Exception) {
        println(e::class.simpleName)
    }

    println("Введите место работы:")
    val workCompany = readln()

    val newuser = AnotherUserStorage4(name, phoneNumber, workCompany)
}

class AnotherUserStorage4(
    val name: String,
    val userPhoneNumber: Long? = null,
    val company: String? = null
) {

}