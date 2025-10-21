package oop_07

fun main() {
    val user1 = UserDataClasses("Alex", "Dobbin", 23)
    val user2 = UserDataClasses("John", "Dobbin", 23)

    println(user1)
    println(user2)

    println(user1.equals(user2))

    println(user1.toString())
    println(user2.toString())
}

data class UserDataClasses(var firstName: String, var lastName: String, var age: Int)

//class UserDataClasees(var firstName: String, var lastName: String, var age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//
//        if (other is UserDataClasees) {
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//        }
//
//        return false;
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "UserDataClasees(firstName='$firstName', lastName='$lastName', age=$age)"
//    }
//}