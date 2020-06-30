//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string, find the first non-repeating character in it and return it's index.
If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create hashmap (int array in updated code), loop through input string, store freqs to characters,
    2) loop through string again, if the count is 1, then return index
    3) return -1;
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        for (int i = 0 ; i < s.length(); i++)
            map[s.charAt(i) - 'a'] = map[s.charAt(i) - 'a'] + 1;
        for (int i = 0; i < s.length(); i++)
            if (map[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}

/*
    Runtime: 10 ms, faster than 62.69% of Java online submissions for First Unique Character in a String.
    Memory Usage: 39.8 MB, less than 74.60% of Java online submissions for First Unique Character in a String.
*/
