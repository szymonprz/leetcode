package binarytreelevelordertraversal

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BinaryTreeLevelOrderTraversalTest : StringSpec({

    "should traverse binary tree level by level" {
        val root = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))

        BinaryTreeLevelOrderTraversal().levelOrder(root) shouldBe listOf(listOf(3), listOf(9, 20), listOf(15, 7))
    }

    "should traverse binary tree level by level second version" {
        val root = TreeNode(1, TreeNode(2, TreeNode(4)), TreeNode(3, null, TreeNode(5)))

        BinaryTreeLevelOrderTraversal().levelOrder(root) shouldBe listOf(listOf(1), listOf(2, 3), listOf(4, 5))
    }

    "should traverse binary tree level by level third version" {
        val root = TreeNode(1, TreeNode(2, TreeNode(3, TreeNode(4, TreeNode(5)))))

        BinaryTreeLevelOrderTraversal().levelOrder(root) shouldBe listOf(listOf(1), listOf(2), listOf(3), listOf(4), listOf(5))
    }
})
