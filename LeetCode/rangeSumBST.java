/*
    938. Range Sum of BST
    https://leetcode.com/problems/range-sum-of-bst/
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) 
            return 0;
        else if (root.val <= R && root.val >= L) {
            return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + root.val;
        } else {
            return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
    }
}

/*
    Runtime: 1 ms, faster than 52.74% of Java online submissions for Range Sum of BST.
    Memory Usage: 43.3 MB, less than 100.00% of Java online submissions for Range Sum of BST.
 */
