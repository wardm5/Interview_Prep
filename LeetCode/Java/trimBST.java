/*
    669. Trim a Binary Search Tree
    https://leetcode.com/problems/trim-a-binary-search-tree/
 */

class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) 
            return null;
        if (root.val < L)
            return root = trimBST(root.right, L, R);
        else if (root.val > R)
            return root = trimBST(root.left, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        if (root.val >= L && root.val <= R) 
            return root;
        else 
            return null;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Trim a Binary Search Tree.
    Memory Usage: 37.8 MB, less than 97.22% of Java online submissions for Trim a Binary Search Tree.
 */
