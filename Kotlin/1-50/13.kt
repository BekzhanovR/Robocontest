import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val inputs = reader.readLine().split(" ")
    val n = inputs[0].toInt()
    val k = inputs[1].toInt()

    if (n == 0) {
        println("1")
    } else {
        println(k + 1)
    }
}