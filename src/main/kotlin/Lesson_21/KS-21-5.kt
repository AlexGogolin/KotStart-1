package org.example.Lesson_21

fun main() {
    val skills = mapOf("Стрельба" to 80, "Магия" to 300, "Скрытность" to 300, "Алхимия" to 50)
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    return this.maxByOrNull { it.value }?.key ?: "Навыков нет"
}