package com.example.designpattern.statepattern

interface State {
    fun pump(body: Body)
    fun normal(body: Body)
}