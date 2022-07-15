package mergetwosortedlists

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MergeTwoSortedListsTest : StringSpec({
    "should merge two sorted lists"{
        val firstHead = ListNode(1, ListNode(2, ListNode(4)))
        val secondHead = ListNode(1, ListNode(3, ListNode(4)))

        val expectedResult = ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(4))))))

        MergeTwoSortedLists().mergeTwoLists(firstHead, secondHead) shouldBe expectedResult
    }

    "should merge two empty lists"{
        val firstHead = null
        val secondHead = null

        val expectedResult = null

        MergeTwoSortedLists().mergeTwoLists(firstHead, secondHead) shouldBe expectedResult
    }

    "should merge empty and not empty list"{
        val firstHead = null
        val secondHead = ListNode(1)

        val expectedResult = ListNode(1)

        MergeTwoSortedLists().mergeTwoLists(firstHead, secondHead) shouldBe expectedResult
    }

    "should merge two single element lists"{
        val first = ListNode(2)
        val second = ListNode(1)

        val expectedResult = ListNode(1, ListNode(2))

        MergeTwoSortedLists().mergeTwoLists(first, second) shouldBe expectedResult
    }

})
