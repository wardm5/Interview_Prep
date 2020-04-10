//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
687. Longest Univalue Path
Easy

Given a binary tree, find the length of the longest path where each node in the
path has the same value. This path may or may not pass through the root.

The length of path between two nodes is represented by the number of edges between
them.

Example 1:
Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output: 2

Example 2:
Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output: 2

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result array
    2) pass root and result array into helper
        2.1) if root is equal to null, return 0
        2.2) create left and right values from passing left and right nodes into helper
        2.3) create left and right values
        2.4) if the left is not null and the root's value matches the left's value, increment left with the left count and add one
        2.5) if the right is not null and the root's value matches the right's value, increment right with the right count and add one
        2.6) set result to either max of result or left + right
        2.7) return the max of left + right
    3) return result
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
    public int longestUnivaluePath(TreeNode root) {
        int[] result = new int[1];
        helper(root, result);
        return result[0];
    }
    private int helper(TreeNode root, int[] result){
        if(root == null)
            return 0;
        int leftCount = helper(root.left, result);
        int rightCount = helper(root.right, result);
        int left = 0;
        int right = 0;
        if(root.left != null && root.left.val == root.val)
            left = leftCount + 1;
        if(root.right != null && root.right.val == root.val)
            right = rightCount + 1;
        result[0] = Math.max(result[0], left + right);
        return Math.max(left, right);
    }
}

/*
    Runtime: 2 ms, faster than 95.94% of Java online submissions for Longest Univalue Path.
    Memory Usage: 42.2 MB, less than 100.00% of Java online submissions for Longest Univalue Path.
*/
