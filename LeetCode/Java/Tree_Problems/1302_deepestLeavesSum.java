//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree, return the sum of values of its deepest leaves.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check root for null
    2) create queue, result value
    3) add root to queue
    4) while queue is not empty
        5) initalize temp Sum
        6) for each item in queue level
            7) get current node and check to see if left or right are not null, add node to queue if not null
            8) add node val to temp sum
        9) replace result with temp sum
    10) return result
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
    public int deepestLeavesSum(TreeNode root) {
        if (root == null)
            return 0;
        int result = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = q.size();
        while(!q.isEmpty()) {
            int tempSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
                tempSum += curr.val;
            }
            result = tempSum;
            size = q.size();
        }
        return result;
    }
}

/*
    Runtime: 4 ms, faster than 46.85% of Java online submissions for Deepest Leaves Sum.
    Memory Usage: 43 MB, less than 100.00% of Java online submissions for Deepest Leaves Sum.
*/
