//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around
its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if the root is null, return true
    2) recurse left and right into helper
        3) if the left and right are null, then return true
        4) if the left and right do not equal each other (including null checks) then return false
        5) recurse down with left's left and right's right and left's right and rights's left and return booleans
    3) return the helper method's boolean value
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null && right != null || left != null && right == null || left.val != right.val)
            return false;
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
    Memory Usage: 37.5 MB, less than 74.15% of Java online submissions for Symmetric Tree.
*/
