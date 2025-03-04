package com.example.designpattern.strategey


fun main() {
    val redBullet = RedBullet()
    val blueBullet = BlueBullet()

    val gun = Gun(redBullet)
    gun.shot()

    gun.changeGun(blueBullet)
    gun.shot()
}
