package validaanagram

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        val count = IntArray(26)
        if (s.length != t.length) return false
        for (i in s.indices) {
            count[s[i] - 'a']++
            count[t[i] - 'a']--
        }
        for (i in 0..25) {
            if (count[i] != 0) return false
        }
        return true
    }
}
