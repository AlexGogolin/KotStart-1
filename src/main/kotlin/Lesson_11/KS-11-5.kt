package org.example.Lesson_11

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val forum = Forum()

    val forumUser1 = forum.createNewUser("Robert")
    val forumUser2 = forum.createNewUser("Martin")

    forum.createNewMessage(forumUser1.userId, "Всем привет! Я Роберт.")
    forum.createNewMessage(forumUser2.userId, "Привет! Я Марти.")
    forum.createNewMessage(forumUser1.userId, "Привет марти как далась тебе тема классов?")
    forum.createNewMessage(forumUser2.userId, "Это 3,14дец...>_<")

    forum.printThread()
}

class UserInfo(
    val userId: Int,
    val userName: String,
) {

}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {

}

class Forum() {
    var id: Int = 0
    val listOfUsers: MutableList<UserInfo> = mutableListOf()
    val listOfMessages: MutableList<ForumMessage> = mutableListOf()
    fun createNewUser(name: String): UserInfo {
        id += 1
        val newUser = UserInfo(id, name)
        listOfUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, message: String) {
        val userSearch = listOfUsers.any { it.userId == userId }
        if (userSearch) {
            val newMessage = ForumMessage(userId, message)
            listOfMessages.add(newMessage)
        } else println("Ошибка: Пользователь с ID $userId не зарегистрирован!")

    }

    fun printThread() {
        for (i in listOfMessages) {
            val author = listOfUsers.find { it.userId == i.authorId }
            println("${author?.userName}: ${i.message}")
        }
    }
}