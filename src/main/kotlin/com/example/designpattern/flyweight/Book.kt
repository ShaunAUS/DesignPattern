package com.example.designpattern.flyweight

class Book(
    private val title: String
) {

    fun read(){
        println("reading book and boot title:$title")
    }
}