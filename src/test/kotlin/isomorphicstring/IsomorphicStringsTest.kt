package isomorphicstring

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class IsomorphicStringsTest : StringSpec({

    "should return true on isomorphic strings" {
        forAll(
            row("egg", "add"),
            row("paper", "title")
        ) { s, t ->
            IsomorphicStrings().isIsomorphic(s, t) shouldBe true
        }
    }

    "should return false on not isomorphic strings" {
        forAll(
            row("foo", "bar"),
            row("badc", "baba"),
        ) { s, t ->
            IsomorphicStrings().isIsomorphic(s, t) shouldBe false
        }
    }


})
