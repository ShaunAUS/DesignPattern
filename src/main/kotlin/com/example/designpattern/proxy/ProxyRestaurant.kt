package com.example.designpattern.proxy

class ProxyRestaurant(
    private val seeFoodRestaurant: SeeFoodRestaurant
) : Restaurant{

    //main
    override fun getMenu() {
        //실제로는 다른 인터페이스 구현체 호출
        seeFoodRestaurant.getMenu()
    }

    //이하 메서드들은 프록시에서 맡게되는 자잘한 메서드들
    fun method1(){
        println("method 1")
    }

    fun method2(){
        println("method 2")
    }

}