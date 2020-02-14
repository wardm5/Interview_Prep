//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given the root node of a binary search tree, return the sum of values of all
nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if root == null, then return 0
    2) check to see if the value is outside the range, if so, return 0
    3) recurse to left, if the value is greater than the R or less than L, then...
        3.1) run/return recursive call on the right (if value was less than the node's value)
        3.2) run/return recurisve call on the left (if value was higher than the node's value)
    4) return value back from recursive calls and root
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        if (root.val < L)
            return rangeSumBST(root.right, L, R);
        if (root.val > R)
            return rangeSumBST(root.left, L, R);
        return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + root.val;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
    Memory Usage: 37.7 MB, less than 6.49% of Java online submissions for To Lower Case.
*/
