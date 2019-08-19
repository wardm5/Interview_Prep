/*
    404. Sum of Left Leaves
    https://leetcode.com/problems/sum-of-left-leaves/
 */

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        else if (root.left != null && root.left.left == null && root.left.right == null)
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + root.left.val;
        else 
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
    Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Sum of Left Leaves.
 */
