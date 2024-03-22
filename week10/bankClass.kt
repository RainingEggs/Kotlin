class BankAccount(
    val accountNumber: String,
    var balance: Double,
    val ownerName: String
)

fun main() {
    // Creating a new bank account
    val myAccount = BankAccount("123456789", 1000.0, "John Doe")

    // Accessing and printing properties
    println("Account Number: ${myAccount.accountNumber}")
    println("Balance: ${myAccount.balance}")
    println("Owner Name: ${myAccount.ownerName}")

    // Performing transactions
    myAccount.balance -= 200.0 // Withdrawing money
    println("After withdrawal, balance: ${myAccount.balance}")

    myAccount.balance += 500.0 // Depositing money
    println("After deposit, balance: ${myAccount.balance}")
}