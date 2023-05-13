import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val a = IntArray(n) { scanner.nextInt() }

    a.sort()

    println(a[n - 2])
}