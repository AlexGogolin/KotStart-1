package org.example.Lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        "Снос планеты земля",
        "Для постройки гиперпространственного экспресс-тоннеля",
        "12 октября 1979 года",
        4.4
    )

    println("Ожидаемое событие: ${alphaCentauri.component1()} \nЦель события: ${alphaCentauri.component2()} " +
            "\nВремя проведения: ${alphaCentauri.component3()} \nРасстояние до события: ${alphaCentauri.component4()} световых года")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Double,
)