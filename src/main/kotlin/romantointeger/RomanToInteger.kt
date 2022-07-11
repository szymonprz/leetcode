package romantointeger

class RomanToInteger {

    fun romanToInteger(roman: String): Int {
        val characters = roman.toCharArray()
        var number = 0
        var index = 0
        while (index < characters.size) {
            val char = characters[index]
            val currentNumber = literalToInt[char]!!
            val nextNumberLiteral = if (index < characters.size - 1) characters[index + 1] else null
            if (nextNumberLiteral != null) {
                val nextNumber = literalToInt[nextNumberLiteral]!!
                if (nextNumber > currentNumber) {
                    number += nextNumber - currentNumber
                    index+=2
                    continue
                }
            }
            index++
            number += currentNumber
        }
        return number
    }

    private val literalToInt = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
}