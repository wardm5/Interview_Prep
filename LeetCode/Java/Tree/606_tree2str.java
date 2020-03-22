//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
<Problem Statement>
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create stringbuilder
    2) recurse through tree
        2.1) if the root is null, return
        2.2) if add root's value to stringbuilder
        2.3) if the root is a leaf, return
        2.4) for each left, add parens, recurse left
        2.5) for each right that is not null, add parens, recurse right
    3) return stingbuilder value
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
    public String tree2str(TreeNode t) {
        StringBuilder build = new StringBuilder();
        helper(t, build);
        return build.toString();
    }
    private void helper(TreeNode root, StringBuilder build) {
        if (root == null)
            return;
        build.append(root.val);
        if (root.left == null && root.right == null)
            return;
        
        // left
        build.append("(");
        helper(root.left, build);
        build.append(")");
        
        // right
        if (root.right != null) {
            build.append("(");
            helper(root.right, build);
            build.append(")");
        }
    }
}

/*
    Runtime: 4 ms, faster than 80.06% of Java online submissions for Construct String from Binary Tree.
    Memory Usage: 42.9 MB, less than 10.53% of Java online submissions for Construct String from Binary Tree.
*/
