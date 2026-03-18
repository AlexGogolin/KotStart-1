package org.example.Lesson_20

fun main() {

    val screenGreetings: (String) -> String = { "С наступающим новым годом, $it!" }
    println(screenGreetings("Robert"))

}