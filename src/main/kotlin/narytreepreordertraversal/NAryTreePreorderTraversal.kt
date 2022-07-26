package narytreepreordertraversal

import java.util.Deque
import java.util.LinkedList

data class Node(var `val`: Int, var children: List<Node?> = listOf())
class NAryTreePreorderTraversal {
    fun preorder(root: Node?): List<Int> {

        val preorder: MutableList<Int> = LinkedList()

        if (root == null) {
            return preorder
        }

        val stack: Deque<Node> = LinkedList()

        stack.offerFirst(root)

        while (stack.size > 0) {
            val node: Node = stack.poll()
            preorder.add(node.`val`)
            val children = node.children
            // iterate from rightmost child to leftmost child
            val it = children.listIterator(children.size)
            while (it.hasPrevious()) {
                stack.offerFirst(it.previous())
            }
        }

        return preorder
    }
}
