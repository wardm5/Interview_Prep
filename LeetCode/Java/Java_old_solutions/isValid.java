/*
    20. Valid Parentheses
    https://leetcode.com/problems/valid-parentheses/
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i =0; i< s.length(); i++) {
            char val = s.charAt(i);
            if (val == '(')
                stack.push(')');
            else if (val == '[')
                stack.push(']');
            else if (val == '{')
                stack.push('}');
            else if (stack.size() == 0 || stack.peek() != val)
                return false;
            else
                stack.pop();
        }
        return (stack.size() == 0);
    }
}

/*
    Runtime: 1 ms, faster than 98.67% of Java online submissions for Valid Parentheses.
    Memory Usage: 37.4 MB, less than 5.06% of Java online submissions for Valid Parentheses.
 */
