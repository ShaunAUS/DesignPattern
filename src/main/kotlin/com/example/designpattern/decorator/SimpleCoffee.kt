package com.example.designpattern.decorator

class SimpleCoffee : Coffee {
    override fun getDescription(): String {
        return "simple coffee"
    }

    override fun getCost(): Double {
        return 3.0
    }
}