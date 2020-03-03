//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every
key of the original BST is changed to the original key plus sum of all keys greater
than the original key in BST.

Example:
Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create res array to store result
    2) call helper method
        2.1) if the root is null, return
        2.2) call helper method to the right
        2.3) set the int variable add root value + res array
        2.4) set root value to result array
        2.5) call helper method to the left
    3) return root
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
    public TreeNode convertBST(TreeNode root) {
        int[] res = new int[1];
        helper(root, res);
        return root;
    }
    public void helper(TreeNode root, int[] res) {
        if (root == null)
            return;
        helper(root.right, res);
        res[0] = res[0] + root.val;
        root.val = res[0];
        helper(root.left, res);
    }
}

/*
    Runtime: 1 ms, faster than 86.04% of Java online submissions for Jewels and Stones.
    Memory Usage: 38.4 MB, less than 5.05% of Java online submissions for Jewels and Stones.
*/
