//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array of integers, return indices of the two numbers such that they add
up to a specific target.

You may assume that each input would have exactly one solution, and you may not
use the same element twice.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create map to store numbers and indexes
    2) loop through input array
    3) if you find a number that matches the target - current number return the index of the number in the map and current index
    4) if you did not find a match, add the current number and index to map
    5) if no solution is found, then return new int array with [0,0]
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++)
            set.add(J.charAt(i));
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i)))
                count++;
        }
        return count;
    }
}

/*
    Runtime: 1 ms, faster than 86.04% of Java online submissions for Jewels and Stones.
    Memory Usage: 38.4 MB, less than 5.05% of Java online submissions for Jewels and Stones.
*/
