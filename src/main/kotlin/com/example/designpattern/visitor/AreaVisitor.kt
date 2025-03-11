package com.example.designpattern.visitor

class AreaVisitor : Visitor {
    override fun visit(circle: Circle) {
        println("AreaVisitor circle radius :" + circle.radius)
    }

    override fun visit(rectangle: Rectangle) {
        println("AreaVisitor rectangle radius:" + rectangle.radius)
    }
}