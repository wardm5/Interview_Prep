//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
590. N-ary Tree Postorder Traversal
Easy

Given an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each
group of children is separated by the null value (See examples).

Follow up:
Recursive solution is trivial, could you do it iteratively?

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]

Example 2:
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create list
    2) call helper method
      2.1) check if node is null
      2.2) loop through each child, then recurse on each child
      2.3) add root's val to list
    3) return result list
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    public void helper(Node root, List<Integer> res) {
        if (root == null)
            return;
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i), res);
        }
        res.add(root.val);
    }
}

/*
  Runtime: 1 ms, faster than 79.14% of Java online submissions for N-ary Tree Postorder Traversal.
  Memory Usage: 41.3 MB, less than 100.00% of Java online submissions for N-ary Tree Postorder Traversal.
*/
