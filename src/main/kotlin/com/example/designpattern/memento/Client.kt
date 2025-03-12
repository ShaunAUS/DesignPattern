package com.example.designpattern.memento


//객체의 내부 상태를 스냅샷처럼 외부에 저장했다가 필요할 때 복원할 수 있는 패턴
fun main() {
    val game = Game()
    val gameCaretaker = GameCaretaker()

    game.set(1,2,3)
    gameCaretaker.add(game.save())

    game.set(4,5,6)
    gameCaretaker.add(game.save())

    game.restore(gameCaretaker.get(1))
    game.restore(gameCaretaker.get(0))

}

