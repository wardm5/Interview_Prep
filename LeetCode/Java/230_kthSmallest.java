//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
230. Kth Smallest Element in a BST
Medium

Given a binary search tree, write a function kthSmallest to find the kth smallest
element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:
Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3
Follow up:
What if the BST is modified (insert/delete operations) often and you need to find
the kth smallest frequently? How would you optimize the kthSmallest routine?

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) Depth first search, keep track of which item your on, if equals k, then save that item
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
    public int kthSmallest(TreeNode root, int k) {
        int[] res = new int[1];
        int[] amount = new int[1];
        helper(root, res, amount, k);
        return res[0];
    }
    public void helper(TreeNode root, int[] res, int[] amount, int k) {
        if (root == null)
            return;
        helper(root.left, res, amount, k);
        amount[0] = amount[0] + 1;
        if (amount[0] == k)
            res[0] = root.val;
        helper(root.right, res, amount, k);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Smallest Element in a BST.
    Memory Usage: 41.6 MB, less than 5.51% of Java online submissions for Kth Smallest Element in a BST.
*/
