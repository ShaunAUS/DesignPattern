package com.example.designpattern.proxy

class ProxyRestaurant(
    private val seeFoodRestaurant: SeeFoodRestaurant
) : Restaurant{
    override fun getMenu() {
        //실제로는 다른 인터페이스 구현체 호출
        seeFoodRestaurant.getMenu()
    }
}