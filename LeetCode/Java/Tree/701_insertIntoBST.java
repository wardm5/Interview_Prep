//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given the root node of a binary search tree (BST) and a value to be inserted into
the tree, insert the value into the BST. Return the root node of the BST after the
insertion. It is guaranteed that the new value does not exist in the original BST.

Note that there may exist multiple valid ways for the insertion, as long as the
tree remains a BST after insertion. You can return any of them.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if root equals null, return null
    2) if the root's value equals the value, return root
    3) if the root's value is greater than the input value, recurse to the left
    4) if the root's value is less than the input value, recurse to the right
    5) return root
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (root.val == val)
            return root;
        if (root.val > val)
            root.left = insertIntoBST(root.left, val);
        else if (root.val < val)
            root.right = insertIntoBST(root.right, val);
        return root;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
    Memory Usage: 41.6 MB, less than 5.17% of Java online submissions for Insert into a Binary Search Tree.
*/
