package oop_07

fun main(){
    val alexAccount = Account("Alex")
    alexAccount.deposit(1000)
    alexAccount.withdraw(500)

    alexAccount.deposit(-20)
    alexAccount.withdraw(-100)

    val alexBalance = alexAccount.calculateBalance()
    println("Alex's balance is ${alexBalance}")
}

class Account(val accountName: String){
    private var balance: Int = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount > 0){
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        }else{
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(withdraw: Int){
        if(-withdraw < 0){
            transactions.add(-withdraw)
            this.balance += -withdraw
            println("$withdraw withdrawn. Balance is now ${this.balance}")
        }else{
            println("Cannot withdraw negative sums")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for(transaction in transactions){
            this.balance += transaction
        }
        return this.balance
    }
}