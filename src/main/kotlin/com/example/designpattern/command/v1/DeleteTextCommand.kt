package com.example.designpattern.command.v1

class DeleteTextCommand(
    private val editor: TextEditor,
    private val position: Int,
    length: Int
) : Command {
    private val deletedText: String = editor.getTextSubstring(position, position + length)

    override fun execute() {
        editor.deleteText(position, deletedText.length)
    }

    override fun undo() {
        editor.insertText(deletedText, position)

    }

}
