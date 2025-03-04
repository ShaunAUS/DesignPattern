package com.example.designpattern.Adapter.v2

class UsbAdapter(
    private val usb: Usb
) : DisplayAdapter {
    override fun display() {
        usb.connectWithUsb()
    }
}