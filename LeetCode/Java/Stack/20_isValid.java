//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create stack to store items
    2) loop through input (nums)
    3) if the char at the curren index is open, place corresponding close character in stack
    4) if the stack is empty or the peek does not match the current character, then return false
    5) else pop the stack
    6) once done iterating, return if the stack size is 0 or not
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(')
                stack.push(')');
            else if (temp == '{')
                stack.push('}');
            else if (temp == '[')
                stack.push(']');
            else if (stack.size() == 0 || stack.peek() != temp)
                return false;
            else
                stack.pop();
        }
        return (stack.size() == 0);
    }
}

/*
    Runtime: 1 ms, faster than 98.66% of Java online submissions for Valid Parentheses.
    Memory Usage: 37.4 MB, less than 5.06% of Java online submissions for Valid Parentheses.
*/
