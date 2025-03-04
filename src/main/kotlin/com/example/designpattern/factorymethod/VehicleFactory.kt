package com.example.designpattern.factorymethod

abstract class VehicleFactory {
    abstract fun createVehicle(): Vehicle

    fun deliverVehicle() {
        val vehicle = createVehicle()
        vehicle.drive()
    }
}