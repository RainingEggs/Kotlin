fun main() {
    val sales = IntArray(5)

    
    sales[0] = 1000
    sales[1] = 1200
    sales[2] = 1800
    sales[3] = 800
    sales[4] = 1900

    // Display sales bar chart
    println("SALES BAR CHART")
    for (i in 0 until 5) {
        print("Store ${i + 1}: ")
        repeat(sales[i] / 100) {
            print("*")
        }
        println() 
    }
}
