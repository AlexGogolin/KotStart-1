package org.example.Lesson_17

fun main() {
    var anyPackage = Package(1, "Madrid")
    println("Посылка находится в ${anyPackage.packageLocation}, она перемещалась ${anyPackage.count} раз")

    anyPackage.packageLocation = "Pekin"

    println("Посылка находится в ${anyPackage.packageLocation}, она перемещалась ${anyPackage.count} раз")

}

class Package(
    val id: Int,
    location: String,
) {
    var count = 0
    var packageLocation = location
        get() = field
        set(value) {
            if (field != value) {
                field = value
                count++
            }
        }
}