/*
    513. Find Bottom Left Tree Value
    https://leetcode.com/problems/find-bottom-left-tree-value/
*/
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) 
            return 0;
        TreeNode result = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = q.size();
        while (!q.isEmpty()) {
            for (int i = size-1; i >= 0; i--) {
                TreeNode tempNode = q.remove();
                if (tempNode.right != null) {
                    result = tempNode.right;
                    q.add(tempNode.right);
                }
                if (tempNode.left != null) {
                    result = tempNode.left;
                    q.add(tempNode.left);
                }
            }
            size = q.size();
        }
        return result.val;
    }
}

/*
    Runtime: 1 ms, faster than 73.69% of Java online submissions for Find Bottom Left Tree Value.
    Memory Usage: 39.4 MB, less than 78.26% of Java online submissions for Find Bottom Left Tree Value.
*/
