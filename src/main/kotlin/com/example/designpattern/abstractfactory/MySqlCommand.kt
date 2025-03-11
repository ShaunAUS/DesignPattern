package com.example.designpattern.abstractfactory

class MySqlCommand :Command{
    override fun execute(query: String) {
        println("mysql command execute")
    }
}