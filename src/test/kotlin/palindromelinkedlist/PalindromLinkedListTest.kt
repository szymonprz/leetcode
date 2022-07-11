package palindromelinkedlist

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PalindromLinkedListTest : StringSpec({

    "should return true on isPalindrome with even number of elements" {
        val head = ListNode(1)
        val second = ListNode(2)
        val third = ListNode(2)
        val last = ListNode(1)
        head.next = second
        second.next = third
        third.next = last

        PalindromLinkedList().isPalindrome(head) shouldBe true
    }

    "should return true on isPalindrome with odd number of elements" {
        val head = ListNode(1)
        val second = ListNode(2)
        val third = ListNode(3)
        val fourth = ListNode(2)
        val last = ListNode(1)
        head.next = second
        second.next = third
        third.next = fourth
        fourth.next = last

        PalindromLinkedList().isPalindrome(head) shouldBe true
    }

    "should return false on isPalindrome with even number of elements" {
        val head = ListNode(1)
        val second = ListNode(2)
        head.next = second

        PalindromLinkedList().isPalindrome(head) shouldBe false
    }

    "should return false on isPalindrome with odd number of elements" {
        val head = ListNode(1)
        val second = ListNode(2)
        val last = ListNode(3)
        head.next = second
        second.next = last

        PalindromLinkedList().isPalindrome(head) shouldBe false
    }


})
