fun main() {
    val n = readLine()!!.toInt()
    val a = IntArray(n + 1) { it }

    a[1] = 0
    var i = 2
    while (i <= n) {
        if (a[i] != 0) {
            var j = i + i
            while (j <= n) {
                a[j] = 0
                j += i
            }
        }
        i++
    }

    val primes = a.filter { it != 0 }
    val ism = arrayOf("Bobur", "Ali")

    if (n == 1) {
        println("Ali")
    } else {
        println(ism[primes.size % 2])
    }
}
