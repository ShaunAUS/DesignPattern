package com.example.designpattern.abstractfactory

class PostgreSqlCommand : Command{
    override fun execute(query: String) {
        println("postgresql command execute")
    }
}