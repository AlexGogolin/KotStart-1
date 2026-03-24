package org.example.Lesson_21

import java.io.File

fun main() {

}

fun File.addInfoToFile(text: String) {
    if (this.exists()) {
        val infoInFile = this.readText()
        val addetToFile = text.lowercase() + "\n$infoInFile"
        this.writeText(addetToFile)
    } else {
        this.writeText(text.lowercase())
    }
}