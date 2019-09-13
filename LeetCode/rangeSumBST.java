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

class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        int left = 0;
        int right = 0;
        if (root.val < L && root.val <= R) {
            right = rangeSumBST(root.right, L, R);
        } else if (root.val > R && root.val >= L) {
            left = rangeSumBST(root.left, L, R);
        } else {
            left = rangeSumBST(root.left, L, R);
            right = rangeSumBST(root.right, L, R);
        }
        if (root.val >= L && root.val <= R) 
            return root.val + left + right;
        else 
            return left + right;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
    Memory Usage: 45.8 MB, less than 97.67% of Java online submissions for Range Sum of BST.
 */
