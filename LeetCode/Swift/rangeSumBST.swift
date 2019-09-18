/*
    938. Range Sum of BST
    https://leetcode.com/problems/range-sum-of-bst/
 */

class Solution {
    func rangeSumBST(_ root: TreeNode?, _ L: Int, _ R: Int) -> Int {
        if (root == nil) {
            return 0;
        }
        var left = 0;
        var right = 0;
        if (root!.val <= R && root!.val >= L) {
            left = rangeSumBST(root?.left, L, R);
            right = rangeSumBST(root?.right, L, R);
        } else if (root!.val < L) {
            right = rangeSumBST(root?.right, L, R);
        } else {
            left = rangeSumBST(root?.left, L, R);
        }
        if (root!.val <= R && root!.val >= L) {
            return root!.val + left + right;
        } else {
            return left + right;
        }
    }
}

/*
    Runtime: 536 ms, faster than 70.25% of Swift online submissions for Range Sum of BST.
    Memory Usage: 22.2 MB, less than 6.67% of Swift online submissions for Range Sum of BST.
 */
