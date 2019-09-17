/*
    1008. Construct Binary Search Tree from Preorder Traversal
    https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1 ; i < preorder.length; i++) {
            helper(preorder[i], root);
        }
        return root;
    }
    public void helper(int x, TreeNode root){
        if (x > root.val) {
            add(x, root.right, root);
        } else {
            add (x, root.left, root);
        }
    }
    public void add(int x, TreeNode rootChild, TreeNode parent) {
        if (rootChild == null && x < parent.val) {
            parent.left = new TreeNode(x);
        } else if (rootChild == null && x > parent.val) {
            parent.right = new TreeNode(x);
        } else if (x < rootChild.val) {
            add(x, rootChild.left, rootChild);
        } else {
            add(x, rootChild.right, rootChild);
        }
    }
}

/*
    Runtime: 1 ms, faster than 63.15% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
    Memory Usage: 35.5 MB, less than 99.77% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
 */
