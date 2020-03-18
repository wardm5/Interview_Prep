//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
589. N-ary Tree Preorder Traversal
Easy

Given an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each 
group of children is separated by the null value (See examples).

Follow up:

Recursive solution is trivial, could you do it iteratively?

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]

Example 2:
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
 
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result list
    2) recurse on root
        2.1) if the root is null, return
        2.2) add root's value to list
        2.3) loop through children, recurse on each node
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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    public void helper(Node root, List<Integer> res) {
        if (root == null)
            return;
        res.add(root.val);
        for (int i = 0; i < root.children.size(); i++)
            helper(root.children.get(i), res);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
    Memory Usage: 41.7 MB, less than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
*/
