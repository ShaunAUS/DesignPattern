package com.example.designpattern.strategey

class RedBullet : GunStrategy {
    override fun shot() {
        println("shot with red bullet")
    }
}