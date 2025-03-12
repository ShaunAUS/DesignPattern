package com.example.designpattern.decorator

class MilkDecorator(
    coffee: Coffee
) : CoffeeDecorator(coffee) {

    override fun getDescription(): String {
        return super.getDescription() + ", Milk"
    }

    override fun getCost(): Double {
        return super.getCost() + 1.5
    }
}