package com.example.designpattern.factorymethod

// 어떤 클래스들의 객체가 만들어져 사용될지를 전적으로 팩토리에 위임 함으로 클라이언트 코드는 팩토리만 알면된다
interface Vehicle {
    fun drive()
}
