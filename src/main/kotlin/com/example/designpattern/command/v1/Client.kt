package com.example.designpattern.command.v1


fun main() {
    val editor = TextEditor()
    val invoker = TextEditorInvoker()

    val insertHello = InsertTextCommand(editor, "Hello, ", 0)
    invoker.executeCommand(insertHello)

    val insertWorld = InsertTextCommand(editor, "World!", 7)
    invoker.executeCommand(insertWorld)

    println("Current text: ${editor.getContent()}")

    invoker.undo()
    println("After undo: ${editor.getContent()}")

    invoker.redo()
    println("After redo: ${editor.getContent()}")

    val deleteCommand = DeleteTextCommand(editor, 0, 7)
    invoker.executeCommand(deleteCommand)
    println("After delete: ${editor.getContent()}")

    invoker.undo()
    println("Final text: ${editor.getContent()}")

}

