import Main.Companion.computerNumber
import Main.Companion.guessNumber
import Main.Companion.playerName
import Main.Companion.playerNumber

class Presenter {

//    var scorePlayer = 0
//    var scoreComputer = 0

    fun rules() {
        if (playerNumber - guessNumber > computerNumber - guessNumber) {
            println("Hasilnya, $playerName Menang")

        } else if (playerNumber - guessNumber > computerNumber - guessNumber) {
            println("Hasilnya, Komputer Menang")

        } else if (playerNumber == computerNumber) {
            println("Hasilnya, Seri")
        }
    }

//    fun rules() {
//
//        if (playerNumber > guessNumber) {
//            scorePlayer = playerNumber - guessNumber
//        } else if (playerNumber < guessNumber) {
//            scoreComputer = guessNumber - playerNumber
//            println("$playerName Menang")
//
//
//        }

}

