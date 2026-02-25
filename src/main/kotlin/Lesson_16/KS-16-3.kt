package org.example.Lesson_16

fun main() {

    val user1 = User()
    println("Впишите пароль:")

    if (!user1.validatePassword(readln())) {
        println("Пароль не верен")
    }else{
        println("Пароль верен!")
    }

}

class User(
    val userName: String = "Bob",
    private val userPassword: String = "12345",
){
    fun validatePassword(password: String) : Boolean {
        return userPassword == password
    }
}