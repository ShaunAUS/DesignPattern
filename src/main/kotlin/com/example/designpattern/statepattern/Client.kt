package com.example.designpattern.statepattern


fun main() {

   val body = Body()
    body.normal()

    body.pump()
    body.pump()
    body.normal()
    body.normal()

}
