package org.example.Lesson_19

fun main() {
    val destroyer = Tank()
    destroyer.shoot()
    destroyer.reload(Ammo.RED)
    destroyer.shoot()
    destroyer.reload(Ammo.BLUE)
    destroyer.shoot()
    destroyer.reload(Ammo.GREEN)
    destroyer.shoot()

}
enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    var currentAmmo: Ammo? = null,
){

    fun reload(ammo: Ammo) {
        currentAmmo = ammo
    }
    fun shoot(){
        val ammo = currentAmmo
        if(ammo == null){
            println("Так не заряжен")
        }else{
            println("Урон нанесен в размере ${ammo.damage}")
        }
    }
}