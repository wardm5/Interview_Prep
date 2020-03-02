//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree, you need to compute the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two
nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges
between them.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create int array with just one value (result)
    2) create helper recurivsve method
    3) if the node is null, return 0
    4) have a left and right int value which recruisivly calls helper
    5) check if the left and right are larger than the result, if so, replace result with left+right
    6) return the max of the left or right + 1
    7) once the helper method is complete, return result[0]
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
     public int diameterOfBinaryTree(TreeNode root) {
         int[] res = new int[1];
         helper(root, res);
         return res[0];
     }
     public int helper(TreeNode root, int[] result) {
         if (root == null)
             return 0;
         else {
             int left = helper(root.left, result);
             int right = helper(root.right, result);
             if (left + right > result[0])
                 result[0] = left + right;
             return Math.max(left,right) + 1;
         }
     }
 }

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
    Memory Usage: 39.4 MB, less than 18.18% of Java online submissions for Diameter of Binary Tree.
*/
