package oop_07

fun main() {
//    println(Direction.NORTH)
//    println(Direction.SOUTH)
//    println(Direction.EAST)
//    println(Direction.WEST)

//    for(direction in Direction.values()){
//        println(direction)
//    }

//    println(Direction.NORTH.name)
//    println(Direction.NORTH.direction)
//    println(Direction.NORTH.distance)
//    Direction.NORTH.printData()

    val direction = Direction.valueOf("east".uppercase())
    when(direction){
        Direction.EAST -> {
            println("The direction is East")
        }
        Direction.WEST -> println("The direction is West")
        Direction.NORTH -> println("The direction is North")
        Direction.SOUTH -> println("The direction is South")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData(){
        println("Direction = $direction and distance = $distance")
    }
}
