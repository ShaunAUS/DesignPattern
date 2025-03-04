package com.example.designpattern.bridge

class WindowComputer : Computer {
    override fun turnOn() {
        println("turnOn window computer")
    }

    override fun turnOff() {
        println("turnOff window computer")
    }
}