//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string, find the length of the longest substring without repeating
characters.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check if string is null or length is zero
    2) create set, max int, and left
    3) for each character in the string
        3.1) check if size of the set is greater than max and if the set contains the current character
        3.2) if it does, then replace max with set's size
        3.3) if the set contains the current character, then drop all items in the set that were left of the current index, increment left variable
        3.4) add current character to set
    4) return the max of either the set's size or the max value
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.size() > max && set.contains(s.charAt(i)))
                max = set.size();
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
        }
        return Math.max(set.size(), max);
    }
}

/*
    Runtime: 7 ms, faster than 73.83% of Java online submissions for Longest Substring Without Repeating Characters.
    Memory Usage: 41.3 MB, less than 5.20% of Java online submissions for Longest Substring Without Repeating Characters.
*/
