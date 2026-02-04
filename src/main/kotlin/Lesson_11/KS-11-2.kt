package org.example.Lesson_11
import java.io.PrintStream


fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))
    val user1 = User2(
        id = 1,
        login = "Alberto",
        password = "1234567",
        email = "alberto@mail.com",
    )

    user1.infoForUser()
    println("Напишите о себе: ")
    user1.bioChange(readln())
    println("Введите пароль")
    user1.changePassword(readln())
    user1.infoForUser()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "Нет информации",
) {
    fun infoForUser(){
        println("$id - $login - $password - $email - $bio")
    }
    fun bioChange(changeBio: String) {
        bio = changeBio
    }
    fun changePassword(oldPassword: String){
        if(oldPassword == password){
            println("Придумайте новый пароль:")
            password = readln()
            println("Ваш пароль изменен!")
        }
    }
}