//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree, you need to compute the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two
nodes in a tree. This path may or may not pass through the root.

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

    }
}

/*
    Runtime: 1 ms, faster than 86.04% of Java online submissions for Jewels and Stones.
    Memory Usage: 38.4 MB, less than 5.05% of Java online submissions for Jewels and Stones.
*/
