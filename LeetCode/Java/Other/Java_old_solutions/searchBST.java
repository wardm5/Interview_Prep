/*
    700. Search in a Binary Search Tree
    https://leetcode.com/problems/search-in-a-binary-search-tree/
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

public TreeNode searchBST(TreeNode root, int val) {
    if (root == null)
        return null;
    if (root.val == val)
        return root;
    else if (root.val > val)
        return searchBST(root.left, val);
    else 
        return searchBST(root.right, val);
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
    Memory Usage: 38.4 MB, less than 100.00% of Java online submissions for Search in a Binary Search Tree.
 */
