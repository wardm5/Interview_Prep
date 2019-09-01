/*
    965. Univalued Binary Tree
    https://leetcode.com/problems/univalued-binary-tree/
 */

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) 
            return true;
        if (root.left != null && root.left.val != root.val)
            return false;
        else if (root.right != null && root.right.val != root.val)
            return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Univalued Binary Tree.
    Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Univalued Binary Tree.
 */
