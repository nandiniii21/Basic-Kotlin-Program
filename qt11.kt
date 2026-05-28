fun main() {
    var num = 1234
    var sum = 0

    print("Sum of digits of $num = ")
    while (num != 0) {
        sum += num % 10
        num /= 10
    }
    println(sum)
}
