package com.example.designpattern.observer

interface News {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyToObservers()
}