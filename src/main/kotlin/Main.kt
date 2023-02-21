import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var guess: Int? = null
    var numGuesses = 0

    println("Versuche die richtige Zahl zu erraten! Denke dir eine Zahl zwischen 1 und 50 aus.")

    while (guess != randomNumber) {
        print("Gib eine Zahl zwischen 1 und 50 ein: ")
        guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Das war keine gültige Zahl. Versuche es erneut.")
        } else if (guess < 1 || guess > 50) {
            println("Deine Zahl muss zwischen 1 und 100 liegen. Versuche es erneut.")
        } else if (guess < randomNumber) {
            println("Die gesuchte Zahl ist höher.")
            numGuesses++
        } else if (guess > randomNumber) {
            println("Die gesuchte Zahl ist niedriger.")
            numGuesses++
        }
    }

    numGuesses++
    println("Herzlichen Glückwunsch, du hast die Zahl $randomNumber in $numGuesses Versuchen erraten!")
}
