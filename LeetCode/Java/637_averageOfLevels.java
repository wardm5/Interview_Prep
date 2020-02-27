//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a non-empty binary tree, return the average value of the nodes on each level
in the form of an array.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) run breath first search on binary tree
    2) each iteration, create sum that will sum that level, divde that level by the size
    3) return array storing results
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
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> result = new ArrayList<>();
        q.add(root);
        int size = q.size();

        while (!q.isEmpty()) {
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                sum += temp.val;
            }
            result.add((double) sum / (double) size);
            size = q.size();
        }
        return result;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Average of Levels in Binary Tree.
    Memory Usage: 42.7 MB, less than 8.00% of Java online submissions for Average of Levels in Binary Tree.
*/
