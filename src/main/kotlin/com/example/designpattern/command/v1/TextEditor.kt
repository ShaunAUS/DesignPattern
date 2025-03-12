package com.example.designpattern.command.v1

class TextEditor {
    private val content = StringBuilder()

    fun insertText(text: String, position: Int) {
        content.insert(position, text)
    }

    fun deleteText(position: Int, length: Int) {
        content.delete(position, position + length)
    }

    fun getTextSubstring(start: Int, end: Int): String {
        return content.substring(start, end)
    }

    fun getContent(): String {
        return content.toString()
    }
}
