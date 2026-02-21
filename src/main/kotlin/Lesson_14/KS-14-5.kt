package org.example.Lesson_14

import java.io.PrintStream

fun main() {

    val chat = Chat()
    chat.addMessage("Bob", "Hallo")
    val lastId = chat.messageList.last().messageId
    chat.addThreadMessage("Tom", "hey", lastId)
    chat.addMessage("Buba", "Any text")
    val lastId2 = chat.messageList.last().messageId
    chat.addThreadMessage("Robin", "Hi", lastId2)
    chat.addThreadMessage("Bork", "hey all", lastId)

    chat.printChat()

}

class Chat(
    val messageList: MutableList<Message> = mutableListOf(),
    var currentId: Int = 0,
) {
    fun addMessage(author: String, text: String) {
        currentId++
        messageList.add(Message(currentId, author, text))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        currentId++
        messageList.add(ChildMessage(currentId, author, text, parentMessageId))
    }

    fun printChat() {
        val grouped = messageList.groupBy { msg ->
            if(msg is ChildMessage) {
                msg.parentId
            }else{
                msg.messageId
            }
        }
        grouped.forEach { (rootId, messages) ->
            messages.forEach { msg ->
                if (msg is ChildMessage) {
                    print("\t")
                }
                println("${msg.authorName} ${msg.messageId} : ${msg.message}")
            }

        }
    }
}

open class Message(
    var messageId: Int,
    val authorName: String,
    val message: String,
)

class ChildMessage(
    messageId: Int,
    authorName: String,
    message: String,
    val parentId: Int,
) : Message(messageId, authorName, message)