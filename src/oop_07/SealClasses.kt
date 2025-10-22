package oop_07

fun main() {

    val success = Result.Success("SUCCESS!")
//    val error = Result.Error("FAILED!")
    val progress = Result.Progress("PROGRESS!")

    getData(success)
//    getData(error)
    getData(progress)

}

fun getData(result: Result){
    when(result){
        is Result.Success -> {
            result.showMessage()
        }
        is Result.Error.NonRecoverableError -> {
            result.showMessage()
        }
        is Result.Error.RecoverableError -> {
            result.showMessage()
        }
        is Result.Error -> {
            result.showMessage()
        }
        is Result.Progress -> {
            result.showMessage()
        }
//        else -> {
//            println("Unknown result")
//        }
    }
}

sealed class Result(val message: String) {
    class Success(message: String) : Result(message) {

    }

    sealed class Error(message: String) : Result(message){
        class RecoverableError(exception: Exception, message: String): Error(message)
        class NonRecoverableError(exception: Exception, message: String): Error(message)
    }

    class Progress(message: String): Result(message)

    fun showMessage(){
        println("Result : $message")
    }
}

// The problem is enum cannot encode more information in here
//enum class Result {
//    SUCCESS,
//    FAILED,
//    IN_PROGRESS
//}
