package com.example.designpattern.bridge

class MacComputer : Computer {
    override fun turnOn() {
        println("turn on mac computer")
    }

    override fun turnOff() {
        println("turn off mac computer")
    }
}