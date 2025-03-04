package com.example.designpattern.strategey

class BlueBullet : GunStrategy {
    override fun shot() {
        println("shot with blue bullet")
    }
}