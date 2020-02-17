//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given the root node of a binary search tree (BST) and a value. You need to find
the node in the BST that the node's value equals the given value. Return the
subtree rooted with that node. If such node doesn't exist, you should return NULL.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if root is null, then return null (did not find value)
    2) if the target is less than root's value, call recursive function (return value)
    3) if the target is larger than root's value, then call recursive function (return value)
    4) else return the root node, as it has the value...
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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        else if (val < root.val) {
            return searchBST(root.left, val);
        } else if (val > root.val) {
            return searchBST(root.right, val);
        } else {
            return root;
        }
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
    Memory Usage: 41.9 MB, less than 8.89% of Java online submissions for Search in a Binary Search Tree.
*/
