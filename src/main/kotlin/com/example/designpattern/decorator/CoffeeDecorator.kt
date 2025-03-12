package com.example.designpattern.decorator

 open class CoffeeDecorator(
    protected val decoratedCoffee: Coffee
) : Coffee {
    override fun getDescription(): String {
        return decoratedCoffee.getDescription()
    }

    override fun getCost(): Double {
        return decoratedCoffee.getCost()
    }
}