package validaanagram

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class ValidAnagramTest : StringSpec({

    "should return true for valid anagram" {
        forAll(
            row("anagram", "nagaram"),
            row("cat", "tac")
        ) { s, t ->
            ValidAnagram().isAnagram(s, t) shouldBe true
        }
    }

    "should return false for invalid anagram" {
        forAll(
            row("anagram", "nagaramm"),
            row("cat", "car")
        ) { s, t ->
            ValidAnagram().isAnagram(s, t) shouldBe false
        }
    }
})
