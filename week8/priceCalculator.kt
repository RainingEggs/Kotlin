fun main() {
    // Get input from the user
    println("Enter the item's wholesale cost:")
    val wholesaleCost = readLine()?.toDoubleOrNull()
    if (wholesaleCost == null || wholesaleCost < 0) {
        println("Invalid input for wholesale cost.")
        return
    }

    println("Enter the markup percentage:")
    val markupPercentage = readLine()?.toDoubleOrNull()
    if (markupPercentage == null || markupPercentage < 0) {
        println("Invalid input for markup percentage.")
        return
    }

    // Calculate and display the retail price
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is $retailPrice.")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * markupPercentage / 100
    return wholesaleCost + markupAmount
}