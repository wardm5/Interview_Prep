//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
217. Contains Duplicate
Easy

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array,
and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true

Example 2:
Input: [1,2,3,4]
Output: false

Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create set
    2) loop through numbers, check against set, else add to set
    3) if no numbers were in set when looping, then return false
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]))
				 return true;
            set.add(nums[i]);
        }
        return false;
    }
}

/*
    Runtime: 6 ms, faster than 68.51% of Java online submissions for Contains Duplicate.
    Memory Usage: 46 MB, less than 5.17% of Java online submissions for Contains Duplicate.
*/
