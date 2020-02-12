/*
    112. Path Sum
    https://leetcode.com/problems/path-sum/
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) 
            return false;
        if (root.left == null && root.right == null && sum - root.val == 0)
            return true;
        else if (root.left == null && root.right == null && sum - root.val != 0)
            return false;
        else
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val); 
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
    Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Path Sum.
 */
