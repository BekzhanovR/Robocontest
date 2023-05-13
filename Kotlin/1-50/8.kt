import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a: Long
    var b: Long
    var c: Long
    var d: Long
    var e: Long
    var mn: Long
    var mx: Long

    a = scanner.nextLong()
    b = scanner.nextLong()
    c = scanner.nextLong()
    d = scanner.nextLong()
    e = scanner.nextLong()

    mn = minOf(minOf(a, b), minOf(c, minOf(d, e)))
    mx = maxOf(maxOf(a, b), maxOf(c, maxOf(d, e)))

    println("${a + b + c + d + e - mx} ${a + b + c + d + e - mn}")
}
