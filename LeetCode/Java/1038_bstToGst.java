//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given the root of a binary search tree with distinct values, modify it so that
every node has a new value equal to the sum of the values of the original tree
that are greater than or equal to node.val.

As a reminder, a binary search tree is a tree that satisfies these constraints:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create int array with one value to store temp tree values
    2) recurse through helper method that has root and the res array
        2.1) if the root is null, then return
        2.2) recurse down to the right
        2.3) add root value to the res
        2.4) replace root value with the res
        2.5) recurse left
    3) return root
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
    public TreeNode bstToGst(TreeNode root) {
        int[] res = new int[1];
        helper(root, res);
        return root;
    }
    public void helper(TreeNode root, int[] res) {
        if (root == null)
            return;
        helper(root.right, res);
        res[0] += root.val;
        root.val = res[0];
        helper(root.left, res);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
    Memory Usage: 41.9 MB, less than 8.89% of Java online submissions for Search in a Binary Search Tree.
*/
