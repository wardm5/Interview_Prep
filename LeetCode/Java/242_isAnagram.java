//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given two strings s and t , write a function to determine if t is an anagram of s.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check if same length, if not, return false
    2) Assuming 26 characters only, create int array of 26
    3) loop through inputs and for s1, increment for each character, for s2 decrement
    4) loop through array of 26 chars, if any item in array is greater than or less than 0, return false;
    5) return true otherwise
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] charArray = new int[26];
        for(int i = 0; i < s.length(); i++) {
            charArray[(int) s.charAt(i) - 97] += 1;
            charArray[(int) t.charAt(i) - 97] -= 1;
        }
        for(int i = 0; i< charArray.length; i++) {
            if(charArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
/*
    Runtime: 3 ms, faster than 89.65% of Java online submissions for Valid Anagram.
    Memory Usage: 39 MB, less than 24.51% of Java online submissions for Valid Anagram.
*/
