package com.example.designpattern.bridge

//여기는 추상부분
abstract class Human(
    //구현부분을 이어주는 브릿지 역활
    private val computer: Computer
) {

    fun turnOn() {
        computer.turnOn()
    }

    fun turnOff() {
        computer.turnOff()
    }

    abstract fun power()
}