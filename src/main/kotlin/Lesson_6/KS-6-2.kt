package org.example.Lesson_6

const val MILISECONDS_IN_SECOND = 1000
fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    print("Введите количество секунд:")
    var userSeconds = readln().toLong()
    val miliSeconds = userSeconds * MILISECONDS_IN_SECOND

    Thread.sleep(miliSeconds)
    println("Прошло секунд: $userSeconds")
}