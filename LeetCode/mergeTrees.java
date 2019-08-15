/*
    617. Merge Two Binary Trees
    https://leetcode.com/problems/merge-two-binary-trees/
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = mergeTrees(t1.left, t2.left); 
        result.right = mergeTrees(t1.right, t2.right);
        return result;
    }
    // public TreeNode merge(TreeNode t1, TreeNode t2) {
    //     if (t1 == null && t2 == null)
    //         return null;
    //     if (t1 != null && t2 != null) {
    //         TreeNode root = new TreeNode(t1.val + t2.val);
    //         root.left = merge(t1.left, t2.left);
    //         root.right = merge(t1.right, t2.right);
    //         return root;
    //     } else if (t1 != null && t2 == null) {
    //         TreeNode root = new TreeNode(t1.val);
    //         root.left = merge(t1.left, null);
    //         root.right = merge(t1.right, null);
    //         return root;
    //     } else {
    //         TreeNode root = new TreeNode(t2.val);
    //         root.left = merge(null, t2.left);
    //         root.right = merge(null, t2.right);
    //         return root;
    //     }
    // }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
    Memory Usage: 44.2 MB, less than 17.28% of Java online submissions for Merge Two Binary Trees.
 */
