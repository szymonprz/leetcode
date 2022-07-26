package binarysearch

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class BinarySearchTest : StringSpec({

    "should find target" {
        forAll(
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 9, 4),
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 2, -1),
        ) { nums, target, expectedIndex ->
            BinarySearch().search(nums, target) shouldBe expectedIndex
        }
    }


})
