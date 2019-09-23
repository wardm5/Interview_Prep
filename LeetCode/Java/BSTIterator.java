/*
    173. Binary Search Tree Iterator
    https://leetcode.com/problems/binary-search-tree-iterator/
 */

class BSTIterator {
    public Queue<Integer> q = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        addToQueue(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        return q.remove();
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (q.size() > 0);
    }
    private void addToQueue(TreeNode root) {
        if (root == null)
            return;
        addToQueue(root.left);
        q.add(root.val);
        addToQueue(root.right);
    }
}

/*
    Runtime: 56 ms, faster than 98.91% of Java online submissions for Binary Search Tree Iterator.
    Memory Usage: 50.6 MB, less than 92.59% of Java online submissions for Binary Search Tree Iterator.
 */
