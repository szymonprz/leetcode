package binarytreelevelordertraversal


data class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)
class BinaryTreeLevelOrderTraversal {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()

        val queue: java.util.Deque<TreeNode> = java.util.ArrayDeque()
        var nextLevelQueue: java.util.Deque<TreeNode> = java.util.ArrayDeque()
        queue.addFirst(root)
        val visitedElements = mutableListOf<List<Int>>()
        visitedElements.add(listOf(root.`val`))

        while (queue.isNotEmpty()) {
            val node = queue.pollFirst()
            node.left?.let {
                nextLevelQueue.addLast(it)
            }
            node.right?.let {
                nextLevelQueue.addLast(it)
            }
            if (queue.isEmpty()) {
                val level = mutableListOf<Int>()
                for (nextLevelElement in nextLevelQueue) {
                    level.add(nextLevelElement.`val`)
                    queue.addLast(nextLevelElement)
                }
                nextLevelQueue = java.util.ArrayDeque()
                if (level.isNotEmpty()) {
                    visitedElements.add(level)
                }
            }
        }
        return visitedElements
    }
}