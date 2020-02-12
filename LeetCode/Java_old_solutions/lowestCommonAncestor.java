/*
    235. Lowest Common Ancestor of a Binary Search Tree
    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        else if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}

/*
    Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
    Memory Usage: 36.7 MB, less than 5.10% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
 */
