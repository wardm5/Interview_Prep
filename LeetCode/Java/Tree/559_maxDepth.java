//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
559. Maximum Depth of N-ary Tree
Easy

Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root
node down to the farthest leaf node.

Nary-Tree input serialization is represented in their level order traversal,
each group of children is separated by the null value (See examples).

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: 3

Example 2:
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: 5

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) Run breath first search on n-ary tree with Queue
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
        public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int result = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int size = q.size();
        while (!q.isEmpty()) {
            for (int i = 0; i < size; i++) {
                Node temp = q.remove();
                for (int j = 0; j < temp.children.size(); j++) {
                    if (temp.children.get(j) != null)
                        q.add(temp.children.get(j));
                }
            }
            result++;
            size = q.size();
        }
        return result;
    }
}

/*
    Runtime: 1 ms, faster than 44.79% of Java online submissions for Maximum Depth of N-ary Tree.
    Memory Usage: 41 MB, less than 100.00% of Java online submissions for Maximum Depth of N-ary Tree.
*/
