package oop_07

fun main(){
    val user1 = UserLazyInit("Alex", "Dobbin", 23)
    val user2 by lazy {
        UserLazyInit("User2", "lastName", 0)
    }

    println(user2.firstName)
}

class UserLazyInit(var firstName: String, var lastName: String, var age: Int){
    init {
        println("User: $firstName was created")
    }
}