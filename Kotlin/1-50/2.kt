import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val numbers = input.split(" ")

    val a = numbers[0].toInt()
    val b = numbers[1].toInt()

    val x = if (a > b) {
        ">"
    } else if (a == b) {
        "="
    } else {
        "<"
    }

    println(x)
}
