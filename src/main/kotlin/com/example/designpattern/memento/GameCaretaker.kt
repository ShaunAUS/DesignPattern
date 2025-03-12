package com.example.designpattern.memento


class GameCaretaker(
    private val mementoList: MutableList<LolMemento> = mutableListOf()
) {
    fun add(state: LolMemento) {
        mementoList.add(state)
    }

    fun get(index: Int): LolMemento {
        return mementoList[index]
    }
}