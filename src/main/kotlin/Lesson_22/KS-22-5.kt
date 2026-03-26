package org.example.Lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        "Снос планеты земля",
        "Для постройки гиперпространственного экспресс-тоннеля",
        "12 октября 1979 года",
        4.4
    )
    val (name, description, date, distance) = alphaCentauri
    println("Ожидаемое событие: $name \nЦель события: $description \nВремя проведения: $date \nРасстояние до события: $distance")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Double,
)