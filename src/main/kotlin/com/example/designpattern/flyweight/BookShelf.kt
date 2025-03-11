package com.example.designpattern.flyweight

class BookShelf {
    companion object {
        private val bookshelf = mutableMapOf<String, Book>()

        fun getBook(title: String): Book {
            return bookshelf.getOrPut(title) {
                println("Adding a new book to the bookshelf: $title")
                Book(title)
            }.also {
                println("Reusing existing book from the bookshelf: $title")
            }
        }
    }
}
