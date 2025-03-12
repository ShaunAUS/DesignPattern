package com.example.designpattern.memento

class Game(
    private var deathCount: Int = 0,
    private var killCount: Int = 0,
    private var assistCount: Int = 0,
) {

    fun set(deathCount: Int, killCount: Int, assistCount: Int) {
        this.deathCount = deathCount
        this.killCount = killCount
        this.assistCount = assistCount
        println("Game state set to :$deathCount/$killCount/$assistCount")
    }

    fun save(): LolMemento {
        return LolMemento(deathCount, killCount, assistCount)
    }

    fun restore(lolMemento: LolMemento) {
        this.deathCount = lolMemento.deathCount
        this.killCount = lolMemento.killCount
        this.assistCount = lolMemento.assistCount
        println("Game state set to :$deathCount/$killCount/$assistCount")
    }
}