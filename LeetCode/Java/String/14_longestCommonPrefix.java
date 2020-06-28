//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
14. Longest Common Prefix
Easy

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check if the string is null, or is length 0
    2) get the result prefix from first string in array
    3) for each word in array
        3.1) while the word does not match reduce pre's substring length by 1
    4) return pre

*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        for (String word : strs) {
            while (word.indexOf(pre) != 0)
                pre = pre.substring(0, pre.length()-1);
        }
        return pre;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
    Memory Usage: 37.5 MB, less than 72.58% of Java online submissions for Longest Common Prefix.
*/
