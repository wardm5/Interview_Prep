//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a sorted (in ascending order) integer array nums of n elements and a target
value, write a function to search target in nums. If target exists, then return
its index, otherwise return -1.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create left and right variables to hold left and right index values
    2) while left is less than or equal to right
        2.1) create mid variable that will be between left and right
        2.2) if the nums[mid] == target, then return mid
        2.3) if the target is less than nums[mid], then set right to mid -1
        2.4) else, set left to mid+1
    3) if there are no values, return -1
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = ((right - left)/2) + left;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                right = mid -1;
            else
                left = mid + 1;
        }
        return - 1;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    Memory Usage: 42.7 MB, less than 5.41% of Java online submissions for Binary Search.
*/
