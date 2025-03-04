package com.example.designpattern.bridge

class Ahuman(computer: Computer) : Human(computer) {
    override fun power() {
        println("Ahuman push computer power button")
    }
}