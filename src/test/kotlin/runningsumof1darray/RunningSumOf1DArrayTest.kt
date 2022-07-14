package runningsumof1darray

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class RunningSumOf1DArrayTest : StringSpec({

    "should return running sum of 1 dimension array" {
        forAll(
            row(intArrayOf(1, 2, 3, 4), intArrayOf(1, 3, 6, 10)),
            row(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 2, 3, 4, 5)),
        ) { input, result ->
            RunningSumOf1DArray().runningSum(input) shouldBe result
        }
    }
})
