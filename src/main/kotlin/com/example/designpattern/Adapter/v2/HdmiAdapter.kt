package com.example.designpattern.Adapter.v2

class HdmiAdapter(
    private val hdmi: Hdmi
) : DisplayAdapter{
    override fun display() {
        hdmi.connectWithHdmi()
    }
}