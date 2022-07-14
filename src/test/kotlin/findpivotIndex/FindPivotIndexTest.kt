package findpivotIndex

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FindPivotIndexTest : StringSpec({

    "should return pivot index if can be found in input" {
        FindPivotIndex().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)) shouldBe 3
    }

    "should return pivot index with negative numbers in input" {
        FindPivotIndex().pivotIndex(intArrayOf(2, 1, -1)) shouldBe 0
    }
    "should return pivot index if is last" {
        FindPivotIndex().pivotIndex(intArrayOf(1, -1, 4)) shouldBe 2
    }

    "should return -1 if pivot index cannot be found" {
        FindPivotIndex().pivotIndex(intArrayOf(1, 2, 3)) shouldBe -1
    }


})
