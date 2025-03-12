package com.example.designpattern.command

import java.util.Stack

class TextEditorInvoker {
    private val undoStack: Stack<Command> = Stack()
    private val redoStack: Stack<Command> = Stack()

    fun executeCommand(command: Command) {
        command.execute()
        undoStack.push(command)
        redoStack.clear()
    }

    fun undo() {
        if (undoStack.isNotEmpty()) {
            val command = undoStack.pop()
            command.undo()
            redoStack.push(command)
        }
    }

    fun redo() {
        if (redoStack.isNotEmpty()) {
            val command = redoStack.pop()
            command.execute()
            undoStack.push(command)
        }
    }
}
