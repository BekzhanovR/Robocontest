import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val jil = scanner.nextInt()

    var x = ""

    when {
        jil < 10 -> x = "000"
        jil < 100 -> x = "00"
        jil < 1000 -> x = "0"
    }

    x = if (jil % 400 == 0 || (jil % 4 == 0 && jil % 100 != 0)) {
        "12/09/$x$jil"
    } else {
        "13/09/$x$jil"
    }

    println(x)
}
