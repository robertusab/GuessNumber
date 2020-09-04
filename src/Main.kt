import java.lang.Math.random

class Main {

    companion object {
        var playerName = ""
        var playerNumber = 0
        var computerNumber = 0
        var guessNumber = 0

        var presenter = Presenter()

        @JvmStatic
        fun main(args: Array<String>) {
            println("Masukkan Nama Pemain")
            playerName = readLine().toString()
            println("Hai, $playerName")

            var round = 0

            do {
                println("Pilih angka 0 sampai 9")
                playerNumber = readLine()!!.toInt()
                println("$playerName memilih angka $playerNumber")

                computerNumber = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).random()
                println("Komputer memilih angka $computerNumber")

                guessNumber = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).random()
                println("Angka tebakkannya adalah $guessNumber")

                presenter.rules()

                println(if (round < 2) "\nRonde selanjutnya\n" else "Permainan Selesai")
                round++

            } while (round < 3)


        }
    }
}