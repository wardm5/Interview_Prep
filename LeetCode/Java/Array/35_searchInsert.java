//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
35. Search Insert Position
Easy

Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
Example 1:
Input: [1,3,5,6], 5
Output: 2

Example 2:
Input: [1,3,5,6], 2
Output: 1

Example 3:
Input: [1,3,5,6], 7
Output: 4

Example 4:
Input: [1,3,5,6], 0
Output: 0

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create ints for low  and high
    2) while low is lower or equal to high
        2.1) create mid int
        2.2) if target is less than the current item, set high to mid +1
        2.3) else set low to mid + 1
    3) return low
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = ((high - low) / 2) + low;
            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
    Memory Usage: 39.6 MB, less than 21.76% of Java online submissions for Search Insert Position.
*/
