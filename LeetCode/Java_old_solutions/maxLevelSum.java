/*
    1161. Maximum Level Sum of a Binary Tree
    https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
 */
 
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        int level = 0;
        int maxSum = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            int sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                sum+= temp.val;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null) 
                    q.add(temp.right);
            }
            level++;
            if (sum > maxSum) {
                maxSum = sum;
                res = level;
            }
        }
        return res;
    }
}

/*
    Runtime: 9 ms, faster than 83.70% of Java online submissions for Maximum Level Sum of a Binary Tree.
    Memory Usage: 40 MB, less than 100.00% of Java online submissions for Maximum Level Sum of a Binary Tree.
 */
