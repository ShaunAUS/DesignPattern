package com.example.designpattern.Adapter.v1

// A 구현부를 호출하지만 실질적으로는 B가 사용됨
class CarRepairShopAdapter(
    private val oldEngine: OldEngine
) : NewEngine {
    override fun startEngine(newCarkey1: Int, newCarKey2: Int) {
        val oldCarKey = newCarkey1 + newCarKey2
        oldEngine.startEngine(oldCarKey)
    }
}