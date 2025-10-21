package oop_07

fun main(){
    val user = User("Ardelingga")
    val friend = User("John", "Smith" )

    println("Name: ${user.name}")
    println("LastName: ${user.lastName}")
    println("Age: ${user.age}")

    println("\n")

    println("Name: ${friend.name}")
    println("LastName: ${friend.lastName}")
    println("Age: ${friend.age}")

    val user2 = User2(age = 19, firstName = "Ioana", lastName = "Dobbi")
    val user2Friend = User2("John", "Smith")
}

class User2(var firstName: String, lastName: String = "LastName", age: Int = 0){

}

class User(var name: String, var lastName: String, var age:Int){
//    var name: String
//
//    init { 
//        if (name.lowercase().startsWith("a")){
//            this.name = name
//        } else {
//            this.name = "User"
//            println("The name doesn't start with the letter 'a' or 'A'")
//        }
//    }

    constructor(name:String) : this(name, "Lastname", 0){
        println("2nd")
    }
    constructor(name:String, lastName: String): this(name, lastName, 0){
        println("3rd")
    }
}