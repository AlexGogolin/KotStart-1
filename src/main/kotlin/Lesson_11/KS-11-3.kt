package org.example.Lesson_11

import org.example.Lessons_1_10.Lesson_10.userLogin

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val anyRoom = Room("ocean.jpg", "Начинающие котлин разработчики")

    val admin = UserInRoom("Alex", "shrek.png", UserStatus.MUTED)
    val user1 = UserInRoom("Bob", "camel.png", UserStatus.MUTED)
    anyRoom.addUser(admin)
    anyRoom.addUser(user1)

    println("\nСписок участников комнаты: ${anyRoom.roomName}:")
    for (user in anyRoom.listOfUsersInRoom) {
        println("${user.userName} [${user.status.statusDescription}] - Аватар: ${user.avatarUrl}")
    }

    anyRoom.updateStatus("Alex", UserStatus.TALKING)
    anyRoom.updateStatus("Bob", UserStatus.BANNED)

}

enum class UserStatus(val statusDescription: String) {
    TALKING("Разговаривает"),
    MUTED("Микрофон выключен"),
    BANNED("Пользователь заглушен"),
}

class UserInRoom(
    val userName: String,
    val avatarUrl: String,
    var status: UserStatus,
) {

}

class Room(
    val wallpaper: String,
    val roomName: String,
) {
    val listOfUsersInRoom = mutableListOf<UserInRoom>()
    fun addUser(user: UserInRoom) {
        listOfUsersInRoom.add(user)
    }

    fun updateStatus(name: String, newStatus: UserStatus) {
        val foundUser = listOfUsersInRoom.find { it.userName == name }
        if(foundUser != null){
            foundUser.status = newStatus
            println("Статус пользователя ${foundUser.userName} обновлен на ${newStatus.statusDescription}")
        }else{
            println("Пользователь $name не найден в комнате")
        }
    }
}