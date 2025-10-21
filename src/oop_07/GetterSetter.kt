package oop_07

fun main() {
    val user = User3("Alex")
    val friend = User3("John", "Smith")
    val user2 = User3(age = 19, firstName = "Ioana", lastName = "Dobbi")

    user.firstName = "Vlad"

    println(user.firstName)
    println(user.lastName)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)

}

class User3(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
}