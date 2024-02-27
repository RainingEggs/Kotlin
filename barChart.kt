fun main() {
    val sales = IntArray(5)

    // Input sales for each store
    for (i in 0 until 5) {
        print("Enter today's sales for store ${i + 1}: ")
        sales[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Display sales bar chart
    println("\nSALES BAR CHART")
    for (i in 0 until 5) {
        print("Store ${i + 1}: ")
        repeat(sales[i] / 100) {
            print("*")
        }
        println() // Move to the next line after printing each store's bar
    }
}