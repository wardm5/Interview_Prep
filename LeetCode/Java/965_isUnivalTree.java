//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Example 1:
Input: [1,1,1,1,1,null,1]
Output: true

Example 2:
Input: [2,2,2,5,2]
Output: false

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if the root is null, then return true
    2) return reursive helper
        2.1) if the root is null, then return true
        2.2) return if the left resurive and right recursive methods are true and if the root is the same value as the passed in value
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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;
        return helper(root, root.val);
    }
    public boolean helper(TreeNode root, int val) {
        if (root == null)
            return true;
        return helper(root.left, val) && helper(root.right, val) && root.val == val;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Univalued Binary Tree.
    Memory Usage: 37.4 MB, less than 5.55% of Java online submissions for Univalued Binary Tree.
*/
