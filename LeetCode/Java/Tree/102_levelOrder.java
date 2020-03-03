//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a binary tree, return the level order traversal of its nodes' values. (ie,
from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if root is null, then return new arraylist
    2) create queue, add root to it, create size variable of the queue
    3) while the queue is not empty
    4) loop through the queue, then create temp list
    5) check if the children are null, if not then add them to the queue
    6) add the temp node's value to the temp list
    7) add list to the result list, set size to q length
    8) return result array
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = q.size();
        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                list.add(temp.val);
            }
            result.add(list);
            size = q.size();
        }
        return result;
    }
}

/*
    Runtime: 1 ms, faster than 68.31% of Java online submissions for Binary Tree Level Order Traversal.
    Memory Usage: 39.1 MB, less than 5.33% of Java online submissions for Binary Tree Level Order Traversal.
*/
