package oop_07

fun main(){
    val user = UserLateInit(firstName = "Alex", "Dobbin", 23)

//    user.favoriteMovie = "Interstellar"

    println(user.favoriteMovie)
}

class UserLateInit(var firstName: String, var lastName : String, var age: Int){
    lateinit var favoriteMovie: String

}