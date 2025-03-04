package com.example.designpattern.Adapter.v2


fun main() {
    val usb = Usb()
    val hdmi = Hdmi()

    val adapters = mutableListOf<DisplayAdapter>()
    adapters.add(UsbAdapter(usb))
    adapters.add(HdmiAdapter(hdmi))

    for (adapter in adapters) {
        adapter.display()
    }

}
