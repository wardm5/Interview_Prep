//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and
the nodes have the same value.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check to make sure if the roots are nulls, then return true
    2) check if p is null and q is not or p is not null and q is not, return false
    3) else return if the recursive left and right functions and if p's value matches q's value
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null && q != null || p != null && q == null)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && q.val == p.val;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
    Memory Usage: 37.1 MB, less than 5.75% of Java online submissions for Same Tree.
*/
