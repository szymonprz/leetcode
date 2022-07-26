package longestpalindrome

class LongestPalindrome {

    fun longestPalindrome(s: String): Int {
        val charCount = s.toCharArray()
            .groupBy { it }
            .mapValues { it.value.size }
        return Math.min(charCount.values.map { it / 2 * 2 }.sum() + 1, s.length)
    }
}
