package org.example.Learn_package

import java.io.PrintStream

fun main(){
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val lamp1 = Device(
        name = "Lamp 1",
        type = "Свет"
    )
    val lamp2 = Device(
        name = "Lamp 1",
        type = "Свет"
    )
    val kalorifer = Device(
        name = "kalorifer1",
        type = "Обогрев"
    )

    val smartApartment = SmartHome()
    smartApartment.addDevice(lamp1)
    smartApartment.addDevice(lamp2)
    smartApartment.addDevice(kalorifer)

    smartApartment.turnOnAll("Свет")

    smartApartment.printStatus()
}

class Device(
    val name: String,
    val type: String,
    var isActive: Boolean = false,
){

}

class SmartHome(
    val devices:MutableList<Device> = mutableListOf(),
){
    fun addDevice(device: Device){
        devices.add(device)
    }
    fun turnOnAll(type: String) {
        val device = devices.filter{it.type == type}
        for(i in device){
            i.isActive = true
        }
    }
    fun printStatus(){
        for (i in devices){
            println(i.type + " " + i.isActive)
        }
    }
}