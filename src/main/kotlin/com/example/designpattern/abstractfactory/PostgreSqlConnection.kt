package com.example.designpattern.abstractfactory

class PostgreSqlConnection : Connection{
    override fun open() {
        println("postgresql connection open")
    }

    override fun close() {
        println("postgresql connection close")
    }
}