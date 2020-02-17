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
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i]))
                return new int[] {map.get(target-nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[2];
    }
}

/*
    Runtime: 1 ms, faster than 99.91% of Java online submissions for Two Sum.
    Memory Usage: 41.9 MB, less than 5.65% of Java online submissions for Two Sum.
*/
