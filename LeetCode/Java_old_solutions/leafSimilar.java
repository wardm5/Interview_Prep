/*
    872. Leaf-Similar Trees
    https://leetcode.com/problems/leaf-similar-trees/
 */

class Solution {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
            return true;
        else if(root1==null || root2==null)
            return false;
        helper(root1, list1);
        helper(root2, list2);
        if (list1.size() != list2.size()) 
            return false;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                return false;
        }
        return true;
    }
    public void helper(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return;
        else if (root.left == null && root.right == null) 
            list.add(root.val);
        else 
            helper(root.left, list);
            helper(root.right, list);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Leaf-Similar Trees.
    Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Leaf-Similar Trees.
 */
