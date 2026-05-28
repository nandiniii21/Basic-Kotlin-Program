fun main() {
    var first = 15
    var second = 4
    println("--- Before Swap ---")
    println("First number = $first")
    println("Second number = $second")
    val temp = first
    first = second
    second = temp
    println("\n--- After Swap ---")
    println("First number = $first")
    println("Second number = $second")
}
