package palindromelinkedlist

data class ListNode(var `val`: Int, var next: ListNode? = null)

class PalindromLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {
        val mid = findMid(head)
        var oldHead = head
        var newHead = reverseMid(mid)
        while(newHead != null){
            if(newHead.`val` != oldHead?.`val`){
                return false
            }
            newHead = newHead.next
            oldHead = oldHead.next
        }
        return true
    }

    private fun findMid(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        var slowPointer: ListNode = head
        var fastPointer = head
        while(fastPointer?.next != null){
            slowPointer = slowPointer.next!!
            fastPointer = fastPointer.next!!.next
        }
        return slowPointer
    }

    private fun reverseMid(head: ListNode?): ListNode? {
        if(head?.next == null) return head
        var prev: ListNode? = null
        var current = head
        var forward: ListNode? = null
        while(current != null){
            forward = current.next
            current.next = prev
            prev = current
            current = forward
        }
        return prev
    }
}