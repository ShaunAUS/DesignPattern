package com.example.designpattern.visitor

class PerimeterVisitor : Visitor {
    override fun visit(circle: Circle) {
        println("PerimeterVisitor circle radius :" + circle.radius)
    }

    override fun visit(rectangle: Rectangle) {
        println("PerimeterVisitor rectangle radius:" + rectangle.radius)
    }
}