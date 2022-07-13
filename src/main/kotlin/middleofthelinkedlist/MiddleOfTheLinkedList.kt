package middleofthelinkedlist

class ListNode(var `val`: Int) {var next: ListNode? = null}

// #linkedlist middleofthelinkedlist
class MiddleOfTheLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        while(fast?.next != null){
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow
    }
}