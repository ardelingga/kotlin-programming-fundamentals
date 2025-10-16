package functions_04

fun main(){
    sendMessage()
    sendMessage("Ardelingga")
    sendMessage("Ardelingga", "Hello!")
    sendMessage(
        name = "Alexa",
        message = "Hello!"
    )
}

fun sendMessage(name: String = "User", message: String = sendText()){
    println("Name = $name and message = $message")
}

fun sendText(): String = "Some text!"

