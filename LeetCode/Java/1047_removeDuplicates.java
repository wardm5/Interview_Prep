//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string S of lowercase letters, a duplicate removal consists of choosing
two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is
guaranteed the answer is unique.



Example 1:

Input: "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and
equal, and this is the only possible move.  The result of this move is that the
string is "aaca", of which only "aa" is possible, so the final string is "ca".

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create stack
    2) loop through the string
        2.1) if the stack size is greater than zero and the stack item matches the current, then remove it from stack
        2.2) push item in the stack otherwise
    3) create StringBuilder
    4) loop through items in the stack, place into StringBuilder, return StringBuilder
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (stack.size() > 0 && stack.peek() == S.charAt(i)) {
                stack.pop();
                continue;
            }
            stack.push(S.charAt(i));
        }
        StringBuilder build = new StringBuilder();
        for (char c : stack)
            build.append(c);
        return build.toString();
    }
}

/*
    Runtime: 15 ms, faster than 70.82% of Java online submissions for Remove All Adjacent Duplicates In String.
    Memory Usage: 42.4 MB, less than 100.00% of Java online submissions for Remove All Adjacent Duplicates In String.
*/
