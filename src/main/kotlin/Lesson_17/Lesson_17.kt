package org.example.Lesson_17


fun main() {

    val secretFolder = Folder("А я вам покажу откуда готовилось нападение", 54, true)
    println("Имя папки: ${secretFolder.name}")
    println("Файлов в ней: ${secretFolder.filesCount}")

    val publicFolder = Folder("Фото с котиками", 10, false)
    println("Имя папки: ${publicFolder.name}")
    println("Файлов в ней: ${publicFolder.filesCount}")
}

class Folder(
    nameOfPackage: String,
    quantityOfFiles: Int,
    val isSecret: Boolean,
) {
    val name = nameOfPackage
        get() = if (isSecret) "Скрытая папка" else field
    val filesCount = quantityOfFiles
        get() = if (isSecret) 0 else field
}
