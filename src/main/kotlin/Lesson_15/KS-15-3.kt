package org.example.Lesson_15

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val users: List<User> = listOf(
        OrdinaryUser("Иван"),
        Administrator("Алексей"),
        OrdinaryUser("Мария")
    )

    users.forEach { it.readForum() }
    users.forEach {
        if( it.name == "Мария" ){
            it.postMessage("Переходите по ссылке и выигрывайте в казино 777")
        }
    }

    println("- Модерация -")
    users.forEach { user ->
        if (user is Administrator) {
            user.deleteMessage()
            user.deleteUser("Мария")
        }
    }
}

abstract class User(
    val name: String,
) {
    fun readForum() {
        println("$name читает ветку форума...")
    }

    fun postMessage(text: String) {
        println("Пользователь $name написал: $text")
    }
}

class Administrator(name: String) : User(name) {
    fun deleteMessage() {
        println("Администратор $name удалил подозрительное сообщение.")
    }

    fun deleteUser(nameUser: String) {
        println("Администратор $name удалил пользователя $nameUser.")
    }
}

class OrdinaryUser(name: String) : User(name)