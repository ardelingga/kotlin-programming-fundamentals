package oop_07

fun main(){

}

interface Engine {
    fun startEngine()
    fun stopEngine()
}

class CarInterface(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("The car is starting the engine")
    }

    override fun stopEngine() {

    }
}

class Truck(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The truck is starting the engine")
    }

    override fun stopEngine() {

    }
}

class Plane(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The plane is starting the engine")
    }

    override fun stopEngine() {

    }
}

class Tesla(val name: String, var color: String): Engine{
    override fun startEngine() {
        println("The tesla is starting the engine")
    }

    override fun stopEngine() {
        TODO("Not yet implemented")
    }

}