package com.example.designpattern.abstractfactory

class MySqlFactory :DataBaseFactory{
    override fun createConnection(): Connection {
        return MySqlConnection()
    }

    override fun createCommand(): Command {
        return MySqlCommand()
    }
}