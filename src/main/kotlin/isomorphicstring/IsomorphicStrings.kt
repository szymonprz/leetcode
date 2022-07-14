package isomorphicstring

class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        var index = 0
        val sToTMapping = mutableMapOf<Char, Char>()
        val tToSMapping = mutableMapOf<Char, Char>()
        while (index < s.length) {
            val sChar = s[index]
            val tChar = t[index]
            if(sToTMapping[sChar] == null && tToSMapping[tChar] == null){
                sToTMapping[sChar] = tChar
                tToSMapping[tChar] = sChar
            }else if(sToTMapping[sChar] != tChar || tToSMapping[tChar] != sChar) return false
            index++
        }
        return true
    }
}