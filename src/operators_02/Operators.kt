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

    val myNumber = 100
    if(myNumber != 150){
        println("They are not equal")
    }else if (myNumber <= 150){
        println("Less than or equal to 150")
    }else {
        print("The condition is false.")
    }


    val isActive2 = false
    if(!isActive2){
        println("The user is active")
    }else {
        println("The user is not active")
    }


    val isActive3 = true
    val score = 100
    val internetSpeed = 5000
    if (isActive3 && score == 100 && internetSpeed == 5000){
        println("Your are at the next level.")
    }else {
        println("You are not at the next level.")
    }


    val isPlaying = true
    val scorePlaying = 100
    if(isPlaying && scorePlaying == 100){
        println("Next level opened")
    }else {
        println("Still at the same level")
    }


    val num1 = 5
    val num2 = -4
    val text = if(num1 > 0 || num2 > 0){
        println("The condition is true")
        "This is text 1"
    }else {
        println("The condition is false")
        "This is text 2"

    }


    val text2 = if(num1 > 0 || num2 > 0)
        "This is text 1"
    else
        "This is text 2"

    println("$text2")


    val text3 = if(num1 > 0 || num2 > 0) "This is text 1" else "This is text 2"
    println("$text3")

    val text4 = if(num1 > 0 || num2 > 0) "This is text 1" else 5
    println("$text4")

    if(num1 > 0 || num2 > 0) println("This condition is true") else println("This condition is false")


}