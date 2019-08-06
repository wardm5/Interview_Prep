/*
    701. Insert into a Binary Search Tree
    https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) 
            return new TreeNode(val);
        else if (root.val > val)
            root.left = insertIntoBST(root.left, val);
        else 
            root.right = insertIntoBST(root.right, val);
        return root;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
    Memory Usage: 38.2 MB, less than 100.00% of Java online submissions for Insert into a Binary Search Tree.
 */
