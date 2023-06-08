import java.util.Scanner

fun fff(n: Int): Int {
    var s = 0
    var num = n
    while (num > 0) {
        val p = num % 10
        s += p
        num /= 10
    }
    return s * s
}

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var k = 0
    var i = 1
    var h = 0
    while (k < n) {
        if (i % fff(i) == 0) {
            k++
        }
        h = i
        i++
    }
    println(h)
}
