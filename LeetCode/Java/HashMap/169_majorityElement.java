//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
169. Majority Element
Easy

Given an array of size n, find the majority element. The majority element is the
element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist
in the array.

Example 1:
Input: [3,2,3]
Output: 3

Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1)Create hashmap to store values to frequencies
    2) loop through numbers, place items into map with frequencies
        2.1) if the amount is greater than half the list, return the number
        2.2) add the number and frequency to the map
    3) return -1 for errors
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++) {
            int amount = map.getOrDefault(nums[i], 0) + 1;
            if (amount > nums.length/2)
                return nums[i];
            map.put(nums[i], amount);
        }
        return -1;
    }
}

/*
    Runtime: 7 ms, faster than 49.13% of Java online submissions for Majority Element.
    Memory Usage: 47.2 MB, less than 5.15% of Java online submissions for Majority Element.
*/
