package com.example.designpattern.mediator

class TeacherMediatorImpl(
    private val students: MutableList<Student> = mutableListOf()
) : TeacherMediator {

    override fun addStudent(student: Student) {
        students.add(student)
    }

    override fun sendMessage(message: String, student: Student) {
        for (thisStudent in students) {
            if (thisStudent != student) {
                thisStudent.receive(message)
            }
        }
    }

}