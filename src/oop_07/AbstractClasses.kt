package oop_07

fun main(){

}

abstract class Vehicle{

    abstract fun move()

    abstract  fun stop()
}

class Car(name: String, color: String, val engines:Int, val doors: Int) : Vehicle(){
    override fun move() {

    }

    override fun stop() {

    }

}