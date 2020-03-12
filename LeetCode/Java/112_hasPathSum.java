//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
112. Path Sum
Easy

Given a binary tree and a sum, determine if the tree has a root-to-leaf path
such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:
Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) return recursive helper method
    2) if root is null, then return false
    3) if the root's left and root's right is null and the root's value plus value equals sum, return true
    4) return helper's left or helper's right method
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
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, sum, 0);
    }
    public boolean helper(TreeNode root, int sum, int val) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && (val + root.val == sum))
            return true;
        return helper(root.left, sum, val + root.val) || helper(root.right, sum, val + root.val);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
    Memory Usage: 39.1 MB, less than 5.88% of Java online submissions for Path Sum.
*/
