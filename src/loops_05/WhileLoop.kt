package loops_05

fun main(){
//    var number = 0
//    while (number < 10){
//        println(number)
//        number++
//    }

//    while(number < 10) println(number++)

//    do {
//        println(number)
//        number++
//    }while (number < 10)


//    while (number < 10){
//        number++
//        if(number > 2 && number < 8){
//            continue
//        }
//        println(number)
//    }

//    while (number < 10){
//        number++
//        if(number in 5..7){
//            continue
//        }
//        println(number)
//    }

//    while (number < 10){
//        number++
//        if(number == 7){
//            break
//        }
//        println(number)
//    }

//    for ( i in 0..10){
//        if(i in 3..8){
//            continue
//        }
//        println(i)
//    }

//    for ( i in 0..10){
//        if(i == 7){
//            break
//        }
//        println(i)
//    }


    var number = 0
    outer@ while (number < 5){
        number++
        println(number)

        var i = 0
        while (i < 5){
            if(i == 0 ) break@outer
            i++
            println("***$i")
        }
    }

}
