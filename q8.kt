fun main() {
    var num = 987654
    var count = 0

    if (num == 0) count = 1

    while (num != 0) {
        num /= 10
        count++
    }
    println("Number of digits: $count")
}
