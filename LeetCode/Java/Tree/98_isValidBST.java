//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
98. Validate Binary Search Tree
Medium

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:

    2
   / \
  1   3

Input: [2,1,3]
Output: true
Example 2:

    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check if root is null, if it is, return true
    2) return recursive method of left and right, including limits
        2.1) check if the root is null, return true
        2.2) if the root is greater than the max or less than min, then its not valid, return false
        2.3) else return the recursive function with root's left and right's values
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
    public boolean isValidBST(TreeNode root) {
        if (root == null) 
          return true;
        return helper(root.left, Long.MIN_VALUE, root.val)  &&  helper(root.right, root.val, Long.MAX_VALUE);
    }
    public static boolean helper(TreeNode root, long min, long max) {
        if (root == null)
          return true;
        if (root.val <= min || root.val >= max)
          return false;
        return helper(root.left, min, root.val)  &&  helper(root.right, root.val, max);
      }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Outermost Parentheses.
    Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
*/
