package com.example.designpattern.decorator


fun main() {

    val simpleCoffee = SimpleCoffee()
    println(simpleCoffee.getDescription())
    println("simpleCoffeeCost:" + simpleCoffee.getCost())

    val milkDecorator = MilkDecorator(simpleCoffee)
    println(milkDecorator.getDescription())
    println("milkCoffeeCost:" + milkDecorator.getCost())

    val sugarDecorator = SugarDecorator(milkDecorator)
    println(sugarDecorator.getDescription())
    println("sugarMilkCoffeeCost:" + sugarDecorator.getCost())


}

