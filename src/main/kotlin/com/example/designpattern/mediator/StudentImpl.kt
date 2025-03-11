package com.example.designpattern.mediator

class StudentImpl(
    teacherMediator: TeacherMediator,
    name: String

    //super
) : Student(teacherMediator, name) {

    override fun send(message: String) {
        println("$name: Sending Message = $message")

        //중재자를 통해 소통
        teacherMediator.sendMessage(message, this)
    }

    override fun receive(message: String) {
        println("$name: Received Message = $message")
    }
}