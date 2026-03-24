package org.example.Lesson_21

import java.io.File

fun File.addInfoToFile(text: String) {
    val infoInFile = this.readText()
    val addedToFile = text.lowercase() + "\n$infoInFile"
    this.writeText(addedToFile)
}