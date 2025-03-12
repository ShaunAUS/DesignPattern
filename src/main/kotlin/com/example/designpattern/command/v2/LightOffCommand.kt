package com.example.designpattern.command.v2

class LightOffCommand(
    private val light: Light
) : Command {
    //대신 명령 수행
    override fun execute() {
        light.turnOff()
    }
}