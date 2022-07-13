package middleofthelinkedlist

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MiddleOfTheLinkedListTest : StringSpec({

    "should return middle element in even numbers of elements" {
        val head = ListNode(1)
        val second = ListNode(2)
        val third = ListNode(2)
        val last = ListNode(1)
        head.next = second
        second.next = third
        third.next = last

        MiddleOfTheLinkedList().middleNode(head) shouldBe third
    }

    "should middle element in odd number of elements" {
        val head = ListNode(1)
        val second = ListNode(2)
        val third = ListNode(3)
        val fourth = ListNode(2)
        val last = ListNode(1)
        head.next = second
        second.next = third
        third.next = fourth
        fourth.next = last

        MiddleOfTheLinkedList().middleNode(head) shouldBe third
    }

})
