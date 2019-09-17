/*
    700. Search in a Binary Search Tree
    https://leetcode.com/problems/search-in-a-binary-search-tree/
 */

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
    public TreeNode searchBST(TreeNode root, int val) {
        // Stack<TreeNode> stack = new Stack<>();
        // stack.push(root);
        // while (!stack.isEmpty()) {
        //     TreeNode temp = stack.pop();
        //     if (temp == null || temp.val == val) {
        //         return temp;
        //     } else if (temp.val > val) {
        //         stack.push(temp.left);
        //     } else {
        //         stack.push(temp.right);
        //     }
        // }
        // return null;
        
        while (root != null) { 
            // pass right subtree as new tree 
            if (val > root.val) 
                root = root.right; 
  
            // pass left subtree as new tree 
            else if (val < root.val) 
                root = root.left; 
            else
                return root; // if the key is found return 1 
        } 
        return root; 
        
//         if (root==null || root.val==val) 
//             return root; 
//         // val is greater than root's key 
//         if (root.val > val) 
//             return searchBST(root.left, val); 

//         // val is less than root's key 
//         return searchBST(root.right, val); 
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
    Memory Usage: 38 MB, less than 99.95% of Java online submissions for Search in a Binary Search Tree.
 */
