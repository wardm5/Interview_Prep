//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
107. Binary Tree Level Order Traversal II
Easy

Given a binary tree, return the bottom-up level order traversal of its nodes'
values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) Breath first search through the tree, place each row into the master array list, then reverse the master arraylist
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = q.size();
        while (!q.isEmpty()) {
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                sub.add(temp.val);
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            result.add(sub);
            size = q.size();
        }
        Collections.reverse(result);
        return result;
    }
}

// class Solution {
//         List<List<Integer>> result;
//         public List<List<Integer>> levelOrderBottom(TreeNode root) {
//             result = new ArrayList<>();
//             //bfs
//             bfs(root, 0);
//             Collections.reverse(result);
//             return result;
//         }
//         public void bfs(TreeNode root, int level) {
//             if (root == null)
//                 return;
//             if (result.size() == level)
//                 result.add(new ArrayList<>());

//             bfs(root.left, level + 1);
//             bfs(root.right, level + 1);
//             result.get(level).add(root.val);
//         }
//     }

/*
    Runtime: 1 ms, faster than 82.41% of Java online submissions for Binary Tree Level Order Traversal II.
    Memory Usage: 39.6 MB, less than 5.00% of Java online submissions for Binary Tree Level Order Traversal II.
*/
