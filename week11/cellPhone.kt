fun main() {
    val cp1 = CellPhones("Samsung", "Galaxy S24", "$799")
    val cp2 = CellPhones("Apple", "iPhone 14", "$1,200")

    println("First Cell Phone:")
    println("Brand: ${cp1.brand}")
    println("Model: ${cp1.model}")
    println("Price: ${cp1.price}")

    println("\nSecond Cell Phone:")
    println("Brand: ${cp2.brand}")
    println("Model: ${cp2.model}")
    println("Price: ${cp2.price}")
}