package twosum

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TwoSumTest : StringSpec({

    "should return indices of two elements with target sum" {
        TwoSum().twoSum(intArrayOf(2, 11, 7, 15), 9) shouldBe intArrayOf(2, 0)
    }
})
