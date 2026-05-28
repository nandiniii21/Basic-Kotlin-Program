fun sumUpToN(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    println("Sum from 1 to 5: ${sumUpToN(5)}")
}
