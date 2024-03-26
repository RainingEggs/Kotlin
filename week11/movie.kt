fun main() {
    println("Welcome to the Movie Rating Checker!")
    // Prompting the user to enter movie rating and age
    print("Enter the movie rating (G, PG, PG-13, R, or NC-17): ")
    val movieRating = readLine()?.toUpperCase()

    print("Enter your age: ")
    val age = readLine()?.toIntOrNull()

    // Checking if the inputs are valid
    if (movieRating !in listOf("G", "PG", "PG-13", "R", "NC-17") || age == null || age <= 0) {
        println("Invalid input. Please enter a valid movie rating and age.")
        return
    }

    // Checking if the user is allowed to see the movie
    val allowedToWatch = when (movieRating) {
        "G" -> true
        "PG" -> true
        "PG-13" -> age >= 13
        "R" -> age >= 17
        "NC-17" -> age >= 17
        else -> false
    }

    // Displaying the result to the user
    if (allowedToWatch) {
        println("You are allowed to see the movie in a theater.")
    } else {
        println("Sorry, you are not allowed to see the movie in a theater.")
    }
}