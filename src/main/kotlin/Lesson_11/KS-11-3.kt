package org.example.Lesson_11

import org.example.Lessons_1_10.Lesson_10.userLogin

fun main(){
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val anyRoom = Room("ocean.jpg", "Начинающие котлин разработчики")

    val admin = UsersInRoom("Alex", "shrek.png", UserStatus.MUTED)
    val user1 = UsersInRoom("Bob", "camel.png", UserStatus.MUTED)
    anyRoom.addUser(admin)
    anyRoom.addUser(user1)
    anyRoom.updateStatus("Alex", UserStatus.TALKING)
    anyRoom.updateStatus("Bob", UserStatus.BANNED)

    println("\nСписок участников комнаты ${anyRoom.roomName}:")
    for (user in anyRoom.listOfUsersInRoom) {
        println("${user.userName} [${user.status.statusDescription}] - Аватар: ${user.avatarUrl}")
    }

}
enum class UserStatus(val statusDescription: String) {
    TALKING("Разговаривает"),
    MUTED("Микрофон выключен"),
    BANNED("Пользователь заглушен"),
}
class UsersInRoom (
    val userName: String,
    val avatarUrl: String,
    var status: UserStatus,
){

}
class Room(
    val wallpaper: String,
    val roomName: String,
){
    val listOfUsersInRoom = mutableListOf<UsersInRoom>()
    fun addUser(user: UsersInRoom) {
        listOfUsersInRoom.add(user)
    }
    fun updateStatus(name: String, newStatus: UserStatus) {
        for( user in listOfUsersInRoom){
            if(user.userName == name){
                user.status = newStatus
                println("Статус пользователя ${user.userName} обновлен на ${newStatus.statusDescription}")
            }
        }
    }
}