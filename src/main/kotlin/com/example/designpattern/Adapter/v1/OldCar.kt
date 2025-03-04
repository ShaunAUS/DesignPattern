package com.example.designpattern.Adapter.v1

class OldCar : OldEngine {
    override fun startEngine(oldCarKey: Int) {
        println("startOldEngine$oldCarKey")
    }

}