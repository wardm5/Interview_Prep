//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where
A and B are valid parentheses strings, and + represents string concatenation.
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is primitive if it is nonempty, and there does not
exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: S =
P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string
in the primitive decomposition of S.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create a count variable that will keep track of parentheses (increment for '(' decrement for ')')
    2) loop through string
        3) if the count is 0, assuming the first will always be '(', add to count, continue
        4) if the count is greater than 0, decrement or increment the count based on the parentheses
        5) if the count is 0, then do not add to string builder, otherwise add to stringbuilder
    6) once loop is completed, return the string stored in the builder
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String removeOuterParentheses(String S) {
        int count = 0;
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (count == 0) {
                count++;
                continue;
            } else if (S.charAt(i) == '(')
                count++;
            else
                count--;
            if (count != 0)
                build.append(S.charAt(i));
        }
        return build.toString();
    }
}

/*
    Runtime: 2 ms, faster than 97.68% of Java online submissions for Remove Outermost Parentheses.
    Memory Usage: 38.1 MB, less than 11.69% of Java online submissions for Remove Outermost Parentheses.
*/
