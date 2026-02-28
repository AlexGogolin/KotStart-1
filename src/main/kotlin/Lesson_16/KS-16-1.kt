package org.example.Lesson_16

fun main() {
    val playCube = Cube()
    playCube.getCubeResult()
}

class Cube {
    private val cubeResult = (1..6).random()

    fun getCubeResult(){
        println(cubeResult)
    }
}