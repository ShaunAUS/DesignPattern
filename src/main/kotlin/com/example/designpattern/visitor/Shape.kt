package com.example.designpattern.visitor

// visitor 받는 메서드제공
interface Shape {
    fun accept(visitor: Visitor)
}