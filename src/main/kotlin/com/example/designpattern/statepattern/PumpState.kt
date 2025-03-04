package com.example.designpattern.statepattern

class PumpState : State {
    override fun pump(body: Body) {
        println("body is already pumped")
    }

    override fun normal(body: Body) {
        println("body is getting normal")
        body.changeState(NormalState())
    }
}