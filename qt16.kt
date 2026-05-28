fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

fun main() {
    val cValue = 37.0
    val fValue = 98.6

    println("$cValue°C is equal to ${celsiusToFahrenheit(cValue)}°F")
    println("$fValue°F is equal to ${fahrenheitToCelsius(fValue)}°C")
}
