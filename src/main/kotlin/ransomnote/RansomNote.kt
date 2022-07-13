package ransomnote

class RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val allLettersOfMagazine = mutableMapOf<Char, Int>()
        magazine.toCharArray().forEach {
            allLettersOfMagazine.compute(it) { char, currentValue ->
                (currentValue ?: 0) + 1
            }
        }
        for(char in ransomNote.toCharArray()){
            allLettersOfMagazine.compute(char) {_, currentValue ->
                (currentValue ?:0) -1
            }
            if(allLettersOfMagazine.getOrDefault(char, -1) < 0) return false
        }
        return true
    }
}