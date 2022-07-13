package fizzbuzz

class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map { result(it) }
    }

    private fun result(n: Int): String {
        return when {
            n % 3 == 0 && n % 5 == 0 -> "FizzBuzz"
            n % 5 == 0 -> "Buzz"
            n % 3 == 0 -> "Fizz"
            else -> n.toString()
        }
    }
}