package oop_07

fun main() {
    val car = Car("BMW", "Red", engines = 4, doors = 4)
    val plane = Plane(name = "Boeing", color = "Blue", engines = 2, doors = 2)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name is stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
}

class Plane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
    override fun move() {
        flying()
        super.move()
    }

    override fun stop() {
        super.stop()
    }

    fun flying() {
        println("The plane is flying")
    }
}