//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Implement an iterator over a binary search tree (BST). Your iterator will be
initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create size, int for current, list for variables
    2) constructor will initalize curr to zero, list to empty ArrayList, fill it with tree values, and size to size of list
        3) helper method: if the root is null, return
        4) recurse left
        5) add item to the list
        6) recurse right
    7) hasNext method: if the curr is less than size, then true, else false
    8) next method: if the curr is less than the size, then return the item in the array, increment curr else return -1
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
class BSTIterator {
    private int curr;
    private List<Integer> list;
    private int size;
    public BSTIterator(TreeNode root) {
        curr = 0;
        list = new ArrayList<>();
        helper(root, list);
        size = list.size();
    }

    /** @return the next smallest number */
    public int next() {
        if (curr < size) {
            int res =  list.get(curr);
            this.curr++;
            return res;
        }
        return -1;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (curr < size);
    }
    private void helper(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

/*
    Runtime: 15 ms, faster than 99.43% of Java online submissions for Binary Search Tree Iterator.
    Memory Usage: 44.8 MB, less than 100.00% of Java online submissions for Binary Search Tree Iterator.
*/
