package com.example.designpattern.factorymethod

import com.example.designpattern.facade.Client
import com.example.designpattern.facade.Gym


fun main() {
    val carFactory = CarFactory()
    carFactory.deliverVehicle()

    val motocycleFactory = MotocycleFactory()
    motocycleFactory.deliverVehicle()

}

