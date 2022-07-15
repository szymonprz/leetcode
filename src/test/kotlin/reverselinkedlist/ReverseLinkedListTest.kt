package reverselinkedlist

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ReverseLinkedListTest : StringSpec({
    "should reverse linked list" {
        var head = ListNode(3, ListNode(2, ListNode(1)))

        ReverseLinkedList().reverseList(head) shouldBe ListNode(1, ListNode(2, ListNode(3)))
    }
})
