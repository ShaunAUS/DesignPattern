package com.example.designpattern.facade

class Gym(
    private val legPress: LegPress,
    private val biceps: Biceps
) {
    fun doWorkout() {
        legPress.doLegPress()
        biceps.doBiceps()
    }
}