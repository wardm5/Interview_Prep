# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def rangeSumBST(self, root: TreeNode, L: int, R: int) -> int:
        if (root == None):
            return 0
        if (root.val < L):
            return self.rangeSumBST(root.right, L, R)
        if (root.val > R):
            return self.rangeSumBST(root.left, L, R)
        return self.rangeSumBST(root.left, L, R) + self.rangeSumBST(root.right, L, R) + root.val

# Runtime: 212 ms, faster than 95.20% of Python3 online submissions for Range Sum of BST.
# Memory Usage: 20.8 MB, less than 100.00% of Python3 online submissions for Range Sum of BST.
