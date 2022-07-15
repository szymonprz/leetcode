package reverselinkedlist

data class ListNode(var `val`: Int, var next: ListNode? = null)

class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null
        var newHead: ListNode? = null
        var current = head
        while(current != null){
            val nextNode = current.next
            current.next = newHead
            newHead = current
            current = nextNode
        }
        return newHead
    }
}