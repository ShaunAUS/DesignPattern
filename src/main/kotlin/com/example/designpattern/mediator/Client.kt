package com.example.designpattern.mediator

fun main() {
    val teacherMediator = TeacherMediatorImpl()

    val student1 = StudentImpl(teacherMediator, "kim")
    val student2 = StudentImpl(teacherMediator, "Lee")
    val student3 = StudentImpl(teacherMediator, "Choi")

    teacherMediator.addStudent(student1)
    teacherMediator.addStudent(student2)
    teacherMediator.addStudent(student3)

    student1.send("Hey there")


}

