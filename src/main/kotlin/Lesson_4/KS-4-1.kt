package org.example.Lesson_4

const val ALL_TABLES = 13

fun main() {
    val reserveTablesToday = 13
    val reserveTablesTomorrow = 9
    val freeTableToday: Boolean = reserveTablesToday < ALL_TABLES
    val freeTableTomorrow: Boolean = reserveTablesTomorrow < ALL_TABLES

    println(
        "Доступность столиков на сегодня: $freeTableToday\n" +
        "Доступность столиков на завтра: $freeTableTomorrow\n"
    )
}