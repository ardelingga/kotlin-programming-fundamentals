package arrays_06

fun main(){
    val names: Array<String> = arrayOf("Ardelingga", "John", "Stephen", "Megan")
    val names2 = arrayOf("Ardelingga", "John", "Stephen", "Megan")

    names[0] = "Alex"

    println("First element ${names[0]}")
    println("Second element ${names[1]}")
    println("Third element ${names[2]}")
    println("Fourth element ${names[3]}")

    println("The size of the array is ${names.size}")
    for(name in names){
        println(name)
    }

    val mixedElements = arrayOf(4, 5, 6, 7, "Name 1", 'a')
    for(i in mixedElements){
        if(i is Int){
            println(i)
        }
    }

}