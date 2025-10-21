package oop_07

fun main() {
//    val calculator = Calculator()
//    val result = calculator.sum(5, 10)

    val result = Calculator.sum(5, 10)

    println("Result: $result")
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}
