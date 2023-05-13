import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val numbers = input.split(" ")

    val var1 = numbers[0].toInt()
    val var2 = numbers[1].toInt()

    val sum = var1 + var2
    println(sum)
}