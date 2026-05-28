fun checkVowelOrConsonant(ch: Char) {
    val lowerCh = ch.lowercaseChar()
    if (lowerCh in 'a'..'z') {
        when (lowerCh) {
            'a', 'e', 'i', 'o', 'u' -> println("$ch is a Vowel")
            else -> println("$ch is a Consonant")
        }
    } else {
        println("$ch is not an alphabetic character")
    }
}

fun main() {
    checkVowelOrConsonant('E')
    checkVowelOrConsonant('k')
}
