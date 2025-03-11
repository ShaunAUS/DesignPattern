package com.example.designpattern.mediator

abstract class Student(
    //중재자를 통해 소통한다
    val teacherMediator: TeacherMediator,
    val name: String
) {

    abstract fun send(message: String)
    abstract fun receive(message: String)

}