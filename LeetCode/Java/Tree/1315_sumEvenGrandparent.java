//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree, return the sum of values of nodes with even-valued grandparent.
(A grandparent of a node is the parent of its parent, if it exists.)

If there are no nodes with an even-valued grandparent, return 0.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if root equals null, return 0
    2) if root's val is even, then call helper with the left and right's children
        2.1) check if child is null
        2.2) create sum variable
        2.3) if the child's left is not null, then add the grandchild's value to sum
        2.4) if the child's rigth is not null, then add the grandchild's value to sum
        2.5) return sum
    3) recurse down left and right of the tree, return the sums of those
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

// Nicer version:
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
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null)
            return 0;
        int sum = 0;
        if (root.val % 2 == 0)
            sum += helper(root.left) + helper(root.right);
        sum += sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
        return sum;
    }
    public int helper(TreeNode root) {
        if (root == null)
            return 0;
        int sum = 0;
        if (root.left != null)
            sum += root.left.val;
        if (root.right != null)
            sum+= root.right.val;
        return sum;
    }
}

// orginal version
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null)
            return 0;
        int left = 0;
        int right = 0;
        if (root.val % 2 == 0) {
            if (root.left != null)
                left = helper(root.left);
            if (root.right != null)
                right = helper(root.right);
        }
        left += sumEvenGrandparent(root.left);
        right += sumEvenGrandparent(root.right);
        return left + right;
    }
    public int helper(TreeNode root) {
        if (root == null)
            return 0;
        int sum = 0;
        if (root.left != null)
            sum += root.left.val;
        if (root.right != null)
            sum+= root.right.val;
        return sum;
    }
}

/*
    Runtime: 1 ms, faster than 99.50% of Java online submissions for Sum of Nodes with Even-Valued Grandparent.
    Memory Usage: 43.1 MB, less than 100.00% of Java online submissions for Sum of Nodes with Even-Valued Grandparent.
*/
