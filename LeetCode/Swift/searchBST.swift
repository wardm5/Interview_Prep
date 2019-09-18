/*
    700. Search in a Binary Search Tree
    https://leetcode.com/problems/search-in-a-binary-search-tree/
 */

class Solution {
    func searchBST(_ root: TreeNode?, _ val: Int) -> TreeNode? {
        if (root == nil) {
            return nil;
        }
        if (root!.val == val) {
            return root;
        } else if (root!.val > val) {
            return searchBST(root!.left, val);
        } else {
            return searchBST(root!.right, val);
        }
    }
}

/*
    Runtime: 176 ms, faster than 66.89% of Swift online submissions for Search in a Binary Search Tree.
    Memory Usage: 21.3 MB, less than 100.00% of Swift online submissions for Search in a Binary Search Tree.
 */
