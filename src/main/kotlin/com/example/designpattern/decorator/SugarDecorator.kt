package com.example.designpattern.decorator

class SugarDecorator(
    coffee: Coffee
) : CoffeeDecorator(coffee){
    override fun getDescription(): String {
        return super.getDescription() + ", Sugar"
    }

    override fun getCost(): Double {
        return super.getCost() + 1.7
    }

}