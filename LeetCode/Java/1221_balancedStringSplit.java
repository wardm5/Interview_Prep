//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) count of values, result count
    2) loop through string
    3) if you see right, increment values by one
    4) if you see left, decrement values by one
    5) check to see if values is 0, if so increment count by one
    6) return count

*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int balancedStringSplit(String s) {
        int values = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                values++;
            else
                values--;
            if (values == 0)
                count++
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.
    Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Split a String in Balanced Strings.
*/
