package com.example.designpattern.statepattern

class Body(
    //초기에는 normal 상태
    private var state: State = NormalState()
) {

    fun pump() {
        state.pump(this)
    }

    fun normal() {
        state.normal(this)
    }

    fun changeState(state: State) {
        this.state = state
    }
}