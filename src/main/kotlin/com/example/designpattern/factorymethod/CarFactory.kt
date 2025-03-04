package com.example.designpattern.factorymethod

class CarFactory : VehicleFactory() {
    override fun createVehicle(): Vehicle {
        return Car()
    }
}