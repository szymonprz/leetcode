package issubsequence

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class IsSubsequenceTest : StringSpec({

    "should return true if is subsequence" {
        forAll(
            row("ace", "abcde"),
            row("", "abcde")
        ) { s, t ->
            IsSubsequence().isSubsequence(s, t) shouldBe true
        }
    }


    "should return false if is not subsequence" {
        forAll(
            row("aec", "abcde"),
            row("b", "c"),
            row("axc", "abcde"),
        ) { s, t ->
            IsSubsequence().isSubsequence(s, t) shouldBe false
        }
    }

})
