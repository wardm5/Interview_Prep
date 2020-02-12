/*
    1021. Remove Outermost Parentheses
    https://leetcode.com/problems/remove-outermost-parentheses/
 */

class Solution {
    public String removeOuterParentheses(String S) {
        int count = 0;
        StringBuilder build = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                count++;
                if (count == 1)
                    continue;
            } else if (c == ')') {
                count--;
                if (count == 0) 
                    continue;
            } 
            build.append(c);
        }
        return build.toString();
    }
}

/*
    Runtime: 2 ms, faster than 97.54% of Java online submissions for Remove Outermost Parentheses.
    Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
 */
