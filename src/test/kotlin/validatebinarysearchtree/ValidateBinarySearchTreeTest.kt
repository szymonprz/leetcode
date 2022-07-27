package validatebinarysearchtree

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ValidateBinarySearchTreeTest : StringSpec({

    "should return valid bst" {
        val root = TreeNode(2, TreeNode(1), TreeNode(3))

        ValidateBinarySearchTree().isValidBST(root) shouldBe true
    }

    "should return invalid bst" {
        val root = TreeNode(5, TreeNode(1), TreeNode(4, TreeNode(3), TreeNode(6)))

        ValidateBinarySearchTree().isValidBST(root) shouldBe false
    }

    "should return invalid bst second version" {
        val root = TreeNode(2, TreeNode(2), TreeNode(2))

        ValidateBinarySearchTree().isValidBST(root) shouldBe false
    }

})
