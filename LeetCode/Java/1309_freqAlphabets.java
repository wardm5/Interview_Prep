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
    1) create string to store result
    2) loop from end to front of input string
    3) if the value is a hash tag, then the next two characters should be converted
    4) if the value is not hash, then convert each character
    5) return string once complete
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String freqAlphabets(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char tempChar = s.charAt(i);
            char add = '';
            if (tempChar == '#') {
                String sub = s.subString(i - 2, i - 1);
                char add = Integer.valueOf(sub) + 'a';
                i+= 2;
            } else {
                char add = Integer.valueOf(tempChar) + 'a';
            }
            res = add + res;
        }
        return res;
    }
}

   
/*
    Runtime: 1 ms, faster than 95.43% of Java online submissions for Find Numbers with Even Number of Digits.
    Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
*/
