package com.example.designpattern.flyweight

//특정 개체가 여러곳, 여러번 필요할떄 하나를 공유하는 기법
fun main() {
    val book1 = BookShelf.getBook("Hello").read()
    val book2 = BookShelf.getBook("Hello").read()
    val book3 = BookShelf.getBook("Clean Code").read()

    if (book1 == book2) {
        println("same book")
    } else {
        println("diffrent book")
    }

}

