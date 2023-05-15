import java.math.BigInteger
import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    val a = s.nextBigInteger()
    val b = s.nextBigInteger()
    val sum = a.add(b)
    println(sum.toString())
}