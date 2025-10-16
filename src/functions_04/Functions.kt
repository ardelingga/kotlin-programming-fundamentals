package functions_04

fun main() {
    sayHello("Ardelingga", 25)

    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("Some data")
    } else {
        showMessage()
    }


    val max = getMax(5, 9)
    println("Max value is $max")

    val max2 = getMax2(5.6, 9.7)
    println("Max2 value is $max2")

    val max3 = getMax3(5, 100, 10)
    println("Max3 value is $max3")
}

fun sayHello(name: String, age: Int) {
    var number = age
    println("Hello, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There's no internet connection")
}

fun getMax(a: Int, b: Int): Int {
    val max = if(a > b) a else b
    return max
}

fun getMax2(a: Int, b: Int): Int = if(a > b) a else b

fun getMax2(a: Double, b: Double): Double = if(a > b) a else b

fun getMax3(a: Int, b: Int, c: Int): Int {
    if(a >= b && a >= c){
        return a
    }else if (b >= a && b >= c){
        return b
    }else {
        return c
    }
}

