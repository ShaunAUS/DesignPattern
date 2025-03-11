package com.example.designpattern.abstractfactory

class DatabaseClient(dataBaseFactory: DataBaseFactory) {
    private val connection: Connection = dataBaseFactory.createConnection()
    private val command: Command = dataBaseFactory.createCommand()

    fun performDatabaseOperations() {
        connection.open()
        command.execute("SELECT * FROM users")
        connection.close()
    }
}