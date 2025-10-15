package operators_02

fun main(){
    var x = 5
    val y = 3.0f

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y} ")

    println("3 + 3 * 4 = ${(3 + 3)  * 4} ")

    var result = x + y
    result += 2
    println("Result: $result")

    result -=  2
    println("Result: $result")

    result *= 2
    println("Result: $result")

    result /= 2
    println("Result: $result")

    result %= 2
    println("Result: $result")

    x = 0
    println("X++ = ${x++ }")
    println("++X = ${++x} ")

    println("X-- = ${x--}")
    println("--X = ${--x}")


    val isActive = true
    if(isActive == true){
        println("The condition is true.")
    }else {
        println("The condition is false.")
    }

    val myNumber = 5
    if(myNumber > 5){
        println("The number is greater than 4")
        println("The number is greater than 4")
        println("The number is greater than 4")
        println("The number is greater than 4")
        println("The number is greater than 4")
    }else if (myNumber >= 4){
        println("The number is greater than 4")
    }else {
        print("The condition is false.")
    }

}