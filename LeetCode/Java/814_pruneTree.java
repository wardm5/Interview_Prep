//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
We are given the head node root of a binary tree, where additionally every node's
value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1
has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant
of X.)

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if root equals null, return null
    2) create booleans which recurse down the tree returning a boolean value
        2.1)  for the helper, if the root is null, return null
        2.2) create left and right boolean values and recurse helper
        2.3) if the left returns false, set root's left to null
        2.4) if the right returns false, set the root's right to null
        2.5) else return the left or the right or if the root's value is 1
    3) if the left returns false, set left to null
    4) if the right returns false, set right to null
    5) return root
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
    public TreeNode pruneTree(TreeNode root) {
        if (root == null)
            return null;
        boolean checkLeft = helper(root.left);
        boolean checkRight = helper(root.right);
        if (!checkLeft)
            root.left = null;
        if (!checkRight)
            root.right = null;
        return root;
    }
    public boolean helper(TreeNode root) {
        if (root == null)
            return false;
        boolean leftBool = helper(root.left);
        boolean rightBool = helper(root.right);
        if (!leftBool)
            root.left = null;
        if (!rightBool)
            root.right = null;
        return leftBool || rightBool || (root.val == 1);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Pruning.
    Memory Usage: 37.4 MB, less than 5.88% of Java online submissions for Binary Tree Pruning.
*/
