fun main(args: Array<String>) {
    print("Enter a number between 1 and 10: ")
    val number = readLine()?.toIntOrNull()

    if (number in 1..10) {
        val romanNumeral = when (number) {
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            10 -> "X"
            else -> "" 
        }
        println("The Roman numeral equivalent of $number is $romanNumeral")
    } else {
        println("Error: Please enter a number between 1 and 10.")
    }
}
