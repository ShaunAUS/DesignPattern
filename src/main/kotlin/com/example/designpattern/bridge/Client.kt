package com.example.designpattern.bridge



fun main() {
    val windowComputer = WindowComputer()
    val ahuman = Ahuman(windowComputer)
    ahuman.power()
    ahuman.turnOn()
    ahuman.turnOff()

    val macComputer = MacComputer()
    val bhuman = Bhuman(macComputer)
    bhuman.power()
    bhuman.turnOn()
    bhuman.turnOff()

}
