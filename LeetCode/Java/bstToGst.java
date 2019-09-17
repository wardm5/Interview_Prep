/*
    1038. Binary Search Tree to Greater Sum Tree
    https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */

class Solution {
    int value = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return null;
        bstToGst(root.right);
        value = value + root.val;
        root.val = value;
        bstToGst(root.left);
        return root;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
    Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
 */
