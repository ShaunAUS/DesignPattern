package com.example.designpattern.facade

class Client(
    private val gym: Gym
) {
    fun doWorkout() {
        gym.doWorkout()
    }
}

fun main() {
    val gym = Gym(legPress = LegPress(), biceps = Biceps())
    Client(gym).doWorkout()
}

