//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given n pairs of parentheses, write a function to generate all combinations of
well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result array
    2) call helper method that takes in the closing, open, result array, and string
        2.1) if the open is zero and close is zero, add the string to the result
        2.2) else if the open is 0 and close is greater than zero, subtract from close and add close paren
        2.3) call helper, with open
        2.4) if the close is higher than 0 and the close is higher than open, close the parens
    3) return res
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n, n, res, "");
        return res;
    }
    public void helper(int open, int close, List<String> res, String temp) {
        if (open == 0 && close == 0) {
            res.add(temp);
            return;
        } else if (open == 0 && close > 0) {
            helper(open, close -1, res, temp+")");
            return;
        }
        helper(open - 1, close, res, temp+ "(");
        if (close > 0 && close > open)
            helper(open, close - 1, res, temp+ ")");
    }
}

/*
    Runtime: 1 ms, faster than 87.83% of Java online submissions for Generate Parentheses.
    Memory Usage: 39.8 MB, less than 18.06% of Java online submissions for Generate Parentheses.
*/
