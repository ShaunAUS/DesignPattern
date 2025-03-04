package com.example.designpattern.strategey

class Gun(
    //여기서 공통으로 묶기때문에 다형성 타입들 가능
    private var gunStrategy: GunStrategy
) {

    fun changeGun(gunStrategy: GunStrategy) {
        this.gunStrategy = gunStrategy
    }

    fun shot() {
        gunStrategy.shot()
    }

}