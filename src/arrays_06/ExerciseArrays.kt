package arrays_06

fun main(){

//    val max = findMax(arrayOf(4,5,6,7,5,5,32))
//    val min = findMin(arrayOf(4,5,6,7,5,5,32))
//
//    println("Max value is $max")
//    println("Min value is $min")

    val max = findMinAndMax(arrayOf(10, 40, 50, 60, 100), true)
    val min = findMinAndMax(arrayOf(10, 40, 50, 60, 100, 2), false)

    println("Max value is $max")
    println("Min value is $min")

}

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]

    for(number in numbers){
        if(number > max){
            max = number
        }
    }

    return max
}
fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]

    for(number in numbers){
        if(number < min){
            min = number
        }
    }

    return min
}

fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int{
    var max = numbers[0]
    var min = max
    if(searchMax){
        for(number in numbers){
            if(number > max){
                max = number
            }
        }
        return max
    }else{
        for(number in numbers){
            if(number < min){
                min = number
            }
        }

        return min
    }
}