fun main() {
    readLine()
    val s = readLine()!!.split(" ").map { it.toInt() }

    for (i in s) {
        if (s.count { it == i } == 1) {
            println(i)
        }
    }
}