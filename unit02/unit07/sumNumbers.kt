fun main() {
    var sum = 0
    print("Enter a positive nonzero integer: ")
    var number = readLine()?.toIntOrNull()

    while (number == null || number <= 0) {
        println("Please enter a positive nonzero integer.")
        print("Enter a positive nonzero integer: ")
        number = readLine()?.toIntOrNull()
    }

    for (i in 1..number) {
        sum += i
    }

    println("The sum of integers from 1 to $number is: $sum")
}