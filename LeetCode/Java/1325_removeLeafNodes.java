//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree root and an integer target, delete all the leaf nodes with
 value target.

Note that once you delete a leaf node with value target, if it's parent node
becomes a leaf node and has the value target, it should also be deleted (you
need to continue doing that until you can't).

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if the root is null, return null
    2) if the get the left and right values recursivly
    3) check if the right and left are null and if the value matches the target, return null if all true
    4) set root's right and left values, return root
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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null)
            return null;
        TreeNode left = removeLeafNodes(root.left, target);
        TreeNode right = removeLeafNodes(root.right, target);
        if (root.val == target && left == null && right == null)
            return null;
        root.left = left;
        root.right = right;
        return root;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Leaves With a Given Value.
    Memory Usage: 40.7 MB, less than 100.00% of Java online submissions for Delete Leaves With a Given Value.
*/
