package com.example.designpattern.statepattern

class NormalState : State {
    override fun pump(body: Body) {
        println("body is getting pump")
        body.changeState(PumpState())
    }

    override fun normal(body: Body) {
        println("body is already normal")
    }
}