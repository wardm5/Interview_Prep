# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def searchBST(self, root: TreeNode, val: int) -> TreeNode:
        if (root == None):
            return None
        if (root.val == val):
            return root
        left = self.searchBST(root.left, val)
        right = self.searchBST(root.right, val)
        if (left != None):
            return left
        if (right != None):
            return right
        return None

# Runtime: 92 ms, faster than 14.42% of Python3 online submissions for Search in a Binary Search Tree.
# Memory Usage: 14.6 MB, less than 100.00% of Python3 online submissions for Search in a Binary Search Tree.
