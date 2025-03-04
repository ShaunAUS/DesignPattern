package com.example.designpattern.Adapter.v1


fun main() {
    val oldCar = OldCar()
    val carRepairShopAdapter = CarRepairShopAdapter(oldCar)

    //새로운 차키로 옛날 자동차 시동
    carRepairShopAdapter.startEngine(newCarkey1 = 1, newCarKey2 = 2)

}
