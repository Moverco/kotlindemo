package cn.moverco.kotlindemo.c5

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

interface OpticalMouse

abstract class USBMouse(var name: String) : USBInputDevice, OpticalMouse {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return "$name"
    }
}

class LogitechMouse : USBMouse("Logitech") {}
class Computer {
    fun addUSBInputDevice(inputDevice: USBInputDevice) {
        println("add usb input device $inputDevice")
    }

    fun addBLEInputDevice(bleInputDevice: BLEInputDevice) {
        println("add ble input device $bleInputDevice")
    }

    fun addInputDevice(inputDevice: USBInputDevice) {
        when (inputDevice) {
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice)
            }
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice)
            }
            else -> {
                throw IllegalArgumentException("wrong device")
            }
        }
    }
}

/**
 * optput:
add usb input device Logitech
 */
fun main(args: Array<String>) {
    val computer: Computer = Computer()
    val logiMouse: LogitechMouse = LogitechMouse()
    computer.addInputDevice(logiMouse)
}