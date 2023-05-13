import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var A: Long
    var B: Long
    var C: Long
    var N: Long
    var d: Long
    N = scanner.nextLong()
    A = scanner.nextLong()
    B = scanner.nextLong()
    C = scanner.nextLong()
    d = A + B + C
    if (N <= d) {
        println("Yes")
    } else {
        println("No")
    }
}
