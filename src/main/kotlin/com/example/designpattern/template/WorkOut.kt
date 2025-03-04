package com.example.designpattern.template

abstract class WorkOut {

    fun doWorkOut() {
        warmUp()
        mainWorkOut()
        coolDown()
    }

    fun warmUp() {
        println("Warm up")
    }

    fun coolDown() {
        println("Cool down")
    }

    abstract fun mainWorkOut()

}