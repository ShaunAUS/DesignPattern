package com.example.designpattern.visitor


interface Visitor {
    fun visit(circle: Circle)
    fun visit(rectangle: Rectangle)
}