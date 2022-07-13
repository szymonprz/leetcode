package ransomnote

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class RansomNoteTest : StringSpec({

    "should return true if can construct ransom note" {
        forAll(
            row("a", "a"),
            row("aa", "aa"),
            row("a", "aaab")
        ) { note, magazine ->
            RansomNote().canConstruct(note, magazine) shouldBe true
        }
    }

    "should return false if cannot construct ransom note" {
        forAll(
            row("aa", "a"),
            row("ac", "aa"),
        ) { note, magazine ->
            RansomNote().canConstruct(note, magazine) shouldBe false
        }
    }

})
