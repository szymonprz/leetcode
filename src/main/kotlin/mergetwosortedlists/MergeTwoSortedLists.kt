package mergetwosortedlists


data class ListNode(var `val`: Int, var next: ListNode? = null)

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result = ListNode(-1, null)
        var current = result as ListNode?
        var list1Pointer = list1
        var list2Pointer = list2

        while (list1Pointer != null && list2Pointer != null) {
            if(list1Pointer.`val` <= list2Pointer.`val`) {
                current?.next = list1Pointer
                list1Pointer = list1Pointer.next
            } else {
                current?.next = list2Pointer
                list2Pointer = list2Pointer.next
            }
            current = current?.next
        }

        if (list1Pointer != null) {
            current?.next = list1Pointer
        }

        while (current?.next != null) current = current.next

        if (list2Pointer != null) {
            current?.next = list2Pointer
        }

        return result.next
    }
}