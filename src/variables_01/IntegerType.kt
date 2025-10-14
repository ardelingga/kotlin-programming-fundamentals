package variables_01
fun main(){
    val name: String = "Ardelingga"
    val age: Int = 25

    println("Hello $name!, your age is $age")

    var number = 23
    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE

    println("Int Max Value: $integerMaxValue")
    println("Int Min Value: $integerMinValue")

    number = 2147483647
    println(number)
}