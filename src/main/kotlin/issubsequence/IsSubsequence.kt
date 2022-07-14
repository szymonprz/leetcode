package issubsequence

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length == 0) return true
        var index = 0
        var subIndex = 0
        while (index < t.length) {
            if (s[subIndex] == t[index]) {
                subIndex++
                index++
            } else {
                index++
            }
            if (subIndex == s.length) return true
        }
        return false
    }
}