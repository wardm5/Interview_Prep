//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given two binary trees and imagine that when you put one of them to cover the other,
some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes
overlap, then sum node values up as the new value of the merged node. Otherwise,
the NOT null node will be used as the node of new tree.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if first input node == null, then return right node
    2) if second input node == null, then return left node
    3) create new Root node with values from left and right
    4) set the root's left to the first left node and second left node's values (recursion)
    5) set the root's right pointer to the first right node and second node's values (recursion)
    6) return root
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
    Memory Usage: 41.9 MB, less than 17.28% of Java online submissions for Merge Two Binary Trees.
*/
