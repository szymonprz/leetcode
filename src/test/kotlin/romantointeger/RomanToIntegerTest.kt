package romantointeger

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.ints.shouldBeExactly

class RomanToIntegerTest : StringSpec({
    "should convert roman literal to in" {
        forAll(
            row("III", 3),
            row("IV", 4),
            row("LVIII", 58),
            row("MCMXCIV", 1994)
        ) { roman, expectedInt ->
            RomanToInteger().romanToInteger(roman) shouldBeExactly expectedInt
        }
    }

})