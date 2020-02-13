/*
    100. Same Tree
    https://leetcode.com/problems/same-tree/
 */

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
        if (p == null && q != null || p != null && q == null)
            return false;
        if (p.val != q.val)
            return false;
        else
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
    Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Same Tree.
 */
