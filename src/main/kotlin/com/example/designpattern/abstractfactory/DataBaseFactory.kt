package com.example.designpattern.abstractfactory

interface DataBaseFactory {
    fun createConnection(): Connection
    fun createCommand(): Command
}