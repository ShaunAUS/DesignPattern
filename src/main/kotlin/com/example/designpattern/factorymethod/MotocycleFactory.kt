package com.example.designpattern.factorymethod

class MotocycleFactory : VehicleFactory() {
    override fun createVehicle(): Vehicle {
        return Motocycle()
    }
}