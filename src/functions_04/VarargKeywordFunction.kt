package functions_04

fun main() {
//    println(sum(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20))
    sum(1,4, 5, 6, 7, 8, 9, 10)
}

fun sum(vararg numbers: Int) {
//    var result = 0
//    for (number in numbers){
//        result += number
//    }
//    return result

    numbers.forEach { println(it) }
}