package validatebinarysearchtree

import java.util.Stack

data class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

class ValidateBinarySearchTree {
    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) return true
        var current: TreeNode? = root
        var previous: TreeNode? = null
        val stack = Stack<TreeNode>()
        while (current != null || stack.isNotEmpty()) {
            if (current != null) {
                stack.push(current)
                current = current.left
            } else {
                current = stack.pop()
                if(previous != null && previous.`val` >= current.`val`) return false
                previous = current
                current = current.right
            }
        }
        return true
    }
}