package com.example.designpattern.abstractfactory

class PostgresqlFactory :DataBaseFactory{
    override fun createConnection(): Connection {
        return PostgreSqlConnection()
    }

    override fun createCommand(): Command {
        return PostgreSqlCommand()
    }
}