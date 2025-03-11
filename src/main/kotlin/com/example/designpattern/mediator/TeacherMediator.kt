package com.example.designpattern.mediator

interface TeacherMediator {
    fun sendMessage(message : String, student : Student)
    fun addStudent(student: Student)
}