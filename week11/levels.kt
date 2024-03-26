fun main() {
    println("Enter the pyramid level desired:")
    val level = readLine()?.toIntOrNull()

    if (level != null && level > 0) {
        for (i in 1..level) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    } else {
        println("Invalid input. Please enter a positive integer.")
    }
}