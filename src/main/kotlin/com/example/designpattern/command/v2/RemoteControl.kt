package com.example.designpattern.command.v2

//Invoker
class RemoteControl(
    private var command: Command
) {
    fun changeCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command.execute()
    }

}