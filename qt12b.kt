fun main() {
    var first = 15
    var second = 45
    println("--- Before Swap ---")
    println("First number = $first")
    println("Second number = $second")
    first = first + second
    second = first - second
    first = first - second
    println("\n--- After Swap ---")
    println("First number = $first")
    println("Second number = $second")
}
