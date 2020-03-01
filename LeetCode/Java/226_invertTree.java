//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if the root is null, return null
    2) store left value of recusrive call
    3) store right value of reursive call
    4) set root's right to the left, left to the right, return root
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
    Memory Usage: 37.4 MB, less than 5.10% of Java online submissions for Invert Binary Tree.
*/
