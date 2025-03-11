package com.example.designpattern.visitor

class Rectangle(
    val radius: Int

) : Shape {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}