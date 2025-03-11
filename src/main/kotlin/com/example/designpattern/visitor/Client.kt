package com.example.designpattern.visitor


// 객체 구조는 안정적이지만 그 구조에 대해 수행해야 할 연산이 자주 변경되거나 추가되는 상황에서 사용
fun main() {
    val circle = Circle(5)
    val rectangle =Rectangle(10)

    val areaVisitor = AreaVisitor()
    val perimeterVisitor = PerimeterVisitor()

    println("=========AreaVisitor===============")
    circle.accept(areaVisitor)
    rectangle.accept(areaVisitor)

    println("=========PerimeterVisitor===============")
    circle.accept(perimeterVisitor)
    rectangle.accept(perimeterVisitor)


}

