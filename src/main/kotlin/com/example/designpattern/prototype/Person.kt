package com.example.designpattern.prototype

class Person(
    private val name: String,
    private val age: Int,
    private var address: String
) : Prototype {
    constructor(other: Person) : this(other.name, other.age, other.address)

    override fun clone(): Person {
        return Person(this)
    }

    fun setAddress(newAddress: String) {
        this.address = newAddress
    }

    fun displayInfo() {
        println("Name: $name, Age: $age, Address: $address")
    }
}