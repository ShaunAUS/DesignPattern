package com.example.designpattern.command

class InsertTextCommand(
    private val editor: TextEditor,
    private val text: String,
    private val position: Int
) : Command {
    override fun execute() {
        editor.insertText(text, position)
    }

    override fun undo() {
        editor.deleteText(position, text.length)
    }
}