import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val f = LongArray(46)
    f[0] = 0
    f[1] = 1

    for (i in 2..45) {
        f[i] = f[i - 2] + f[i - 1]
    }

    val result = f[n] * 2
    println(result)
}
