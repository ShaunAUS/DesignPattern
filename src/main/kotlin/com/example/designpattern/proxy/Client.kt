package com.example.designpattern.proxy

import com.example.designpattern.facade.Client
import com.example.designpattern.facade.Gym
import com.example.designpattern.factorymethod.CarFactory
import com.example.designpattern.factorymethod.MotocycleFactory


fun main() {
    val seeFoodRestaurant = SeeFoodRestaurant()

   //내부적으로는 다른 인터페이스 구현체 호출
    val proxyRestaurant = ProxyRestaurant(seeFoodRestaurant)
    proxyRestaurant.getMenu()
}

