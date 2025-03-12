package com.example.designpattern.prototype


//생성 비용이 큰 클래스의 인스턴스들을 매번 새로 생성하는것이 아닌, 한번만들어놓고 복제해서 사용
// 프로토 타입 패턴은 다루는 객체에 '자기복제기능'을 넣음으로써 구현한다
fun main() {
    val original = Person("Kim", 30, "123 mainStreet")
    original.displayInfo()

    val clonePerson = original.clone()
    clonePerson.setAddress("456 cloneStreet")

    original.displayInfo()
    clonePerson.displayInfo()

}

