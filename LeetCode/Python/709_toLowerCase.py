class Solution:
    def toLowerCase(self, str: str) -> str:
        res = ""
        for char in str:
            res = res + char.lower()
        return res

# Runtime: 28 ms, faster than 55.25% of Python3 online submissions for To Lower Case.
# Memory Usage: 12.8 MB, less than 100.00% of Python3 online submissions for To Lower Case.
