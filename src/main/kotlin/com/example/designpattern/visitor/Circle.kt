package com.example.designpattern.visitor

class Circle(
    val radius: Int
) : Shape {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)

    }
}