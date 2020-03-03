//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string s formed by digits ('0' - '9') and '#' . We want to map s to
English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create StringBuilder to store result
    2) loop through input from the end to the front
        3)
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder build = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char tempChar = s.charAt(i);
            char add = ' ';
            if (tempChar == '#') {
                String sub = s.substring(i - 2, i);
                int temp = Integer.parseInt(sub);
                add = (char)('a' + temp - 1);
                i-= 2;
            } else {
                int temp = Integer.valueOf(tempChar - '0') - 1;
                add = (char)('a' + temp);
            }
            build.insert(0, add);
        }
        return build.toString();
    }
}


/*
    Runtime: 1 ms, faster than 83.77% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
    Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
*/
