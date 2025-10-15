package nullability_03

fun main(){
    var text: String? = "makan"
    if(text != null){
        println(text.length)
    }else {
        println("The variable is null.")
    }


    val text2 = text ?: "Some text."
    println(text2)



    var textThird: String? = null
    textThird = "This variable is not null."
    var textFourth = ""
    if (textThird != null)
        textFourth = textThird
    else
        textFourth = "This variable is null."
    println(textFourth)
}