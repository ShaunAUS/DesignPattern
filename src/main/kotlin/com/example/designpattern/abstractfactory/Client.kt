package com.example.designpattern.abstractfactory

fun main() {
    val mysql = DatabaseClient(MySqlFactory())
    mysql.performDatabaseOperations()

    println("=======================")
    val postgresql = DatabaseClient(PostgresqlFactory())
    postgresql.performDatabaseOperations()

}

