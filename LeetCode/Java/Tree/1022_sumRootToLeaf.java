//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents
a binary number starting with the most significant bit.  For example, if the path
is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.

For all leaves in the tree, consider the numbers represented by the path from
the root to that leaf.

Return the sum of these numbers.

Example 1:
Input: [1,0,1,0,1,0,1]
Output: 22
Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if the root is null, then return 0
    2) call and return helper method (with root and 0 as paramenters)
        2.1) if the root is null, then return 0
        2.2) multiply the sum by two and add the root's value
        2.3) if the left is not null or the right is not null, then call the recursive function, otherwise return sum
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
    public int sumRootToLeaf(TreeNode root) {
        if(root == null)
            return 0;
        return helperInorder(root,0);
    }
    public int helperInorder(TreeNode root,int sum) {
        if(root == null)
            return 0;
        sum = 2*sum + root.val;
        if(root.left != null || root.right != null)
            return helperInorder(root.left,sum) + helperInorder(root.right,sum);
        return sum;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Root To Leaf Binary Numbers.
    Memory Usage: 37.9 MB, less than 25.93% of Java online submissions for Sum of Root To Leaf Binary Numbers.
*/
