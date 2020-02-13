/*
    22. Generate Parentheses
    https://leetcode.com/problems/generate-parentheses/
*/

class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0)
            return result;
        helper("", 0, 0, n);
        return result;
    }
    public void helper(String parens, int open, int close, int n) {
        if (parens.length() == n * 2)
            result.add(parens);
        if (open < n)
            helper(parens + "(", open+1, close, n);
        if (close < open)
            helper(parens + ")", open, close + 1, n);
    }
}

/*
    Runtime: 1 ms, faster than 93.91% of Java online submissions for Generate Parentheses.
    Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Generate Parentheses.
*/
