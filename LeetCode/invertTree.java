/*
    226. Invert Binary Tree
    https://leetcode.com/problems/invert-binary-tree/
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
    Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
 */
