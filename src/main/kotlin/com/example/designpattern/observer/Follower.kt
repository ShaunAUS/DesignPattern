package com.example.designpattern.observer

class Follower(
    private val name: String
) : Observer {
    override fun update(news: String) {
        println("Follower:" + name + "newNews :$news")

    }
}