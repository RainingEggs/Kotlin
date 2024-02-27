import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 11)
    var guess: Int
    var attempts = 0

    do {
        print("Guess the number (between 1 - 10): ")
        guess = readLine()?.toIntOrNull() ?: 0

        when {
            guess == 0 -> println("Enter a valid number.")
            guess < secretNumber -> println("Too low")
            guess > secretNumber -> println("Too high")
            else -> println("You guessed the number $secretNumber correctly in $attempts attempts.")
        }
        attempts++
    } while (guess != secretNumber)
}