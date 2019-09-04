/*
    559. Maximum Depth of N-ary Tree
    https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */

class Solution {
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int max=0;
        for (Node n : root.children)
            max=Math.max(maxDepth(n),max);
        return max+1;
    }
}

/*
    Runtime: 1 ms, faster than 97.65% of Java online submissions for Maximum Depth of N-ary Tree.
    Memory Usage: 45.7 MB, less than 69.05% of Java online submissions for Maximum Depth of N-ary Tree.
 */
