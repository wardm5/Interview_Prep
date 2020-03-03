class Solution {
    private List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return result;
        helper(root, String.valueOf(root.val));
        return result;
    }
    public void helper(TreeNode root, String current){
        if(root == null)
            return;
        if (root.left == null && root.right == null)
            result.add(current);
        if (root.left != null)
            helper(root.left , current + "->"+root.left.val);
        if (root.right != null)
            helper(root.right , current + "->"+root.right.val); 
    }
}
