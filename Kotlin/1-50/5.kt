import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val z = scanner.nextInt()
    var s = 0

    if (z == 0) {
        s = -1
    } else {
        var n: Int

        if (z < 0) {
            n = -z
        } else {
            n = z
        }

        var i = 1

        while (i * i <= n) {
            if (n % i == 0) {
                s += 1

                if (i * i != n) {
                    s += 1
                }
            }

            i += 1
        }

        if (s % 2 == 1 && z > 0) {
            s += 1
        }
    }

    println(s)
}