package com.example.designpattern.command.v2



fun main() {
    val livingRoomLight = Light()

    val lightOn: Command = LightOnCommand(livingRoomLight)
    val lightOff: Command = LightOffCommand(livingRoomLight)

    val remote = RemoteControl(lightOn)
    remote.pressButton()

    remote.changeCommand(lightOff)
    remote.pressButton()
}

