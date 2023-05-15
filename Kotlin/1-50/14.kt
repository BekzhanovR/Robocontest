import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val input = reader.readLine()
    val inputs = input.split(" ")
    val n = inputs[0].toLong()
    val k = inputs[1].toLong()

    val output: Long
    if (n == 0L) {
        output = 1L
    } else {
        output = modularPow(k + 1, n, 1000000007)
    }

    println(output)
}

fun modularPow(baseNumber: Long, exponent: Long, modulus: Long): Long {
    var result = BigInteger.ONE
    var base = BigInteger.valueOf(baseNumber)
    val mod = BigInteger.valueOf(modulus)

    var exp = exponent
    while (exp > 0) {
        if (exp % 2 == 1L) {
            result = result.multiply(base).mod(mod)
        }
        base = base.multiply(base).mod(mod)
        exp /= 2
    }

    return result.toLong()
}
