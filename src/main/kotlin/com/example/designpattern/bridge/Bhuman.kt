package com.example.designpattern.bridge

class Bhuman(computer: Computer) : Human(computer) {

    override fun power() {
        println("Bhuman push computer power button")
    }
}