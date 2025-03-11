package com.example.designpattern.abstractfactory

class MySqlConnection : Connection{
    override fun open() {
        println("mysql connection open")
    }

    override fun close() {
        println("mysql connection close")
    }
}