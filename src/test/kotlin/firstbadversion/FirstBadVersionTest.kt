package firstbadversion

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class FirstBadVersionTest : StringSpec({

    "should return first bad version" {
        forAll(
            row(5, 4, 4),
            row(5, 2, 2),
            row(5, 3, 3),
            row(1, 1, 1),
            row(2126753390, 1702766719, 1702766719),
        ) { n, badVersion, expectedBadVersion ->
            FirstBadVersion(badVersion).firstBadVersion(n) shouldBe expectedBadVersion
        }
    }
})
