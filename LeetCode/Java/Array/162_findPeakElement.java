//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
162. Find Peak Element

A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and
return its index.

The array may contain multiple peaks, in that case return the index to any one
of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5
Explanation: Your function can return either index number 1 where the peak element is 2,
             or index number 5 where the peak element is 6.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if the length is 1, then return 0
    2) if the length of the array is 2, return the index of the max
    3) create max index and max variable
    4) loop through array
        4.1) if the current item is greater than the prior number and this number is greater than the next number, return index
        4.2) else if the number is greate than max, replace max, set max index to current index
    5) if the last item is greater than max, return index of the last number, otherwise return max index

*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        if (nums.length == 2) {
            if (nums[0] > nums[1]) return 0;
            else return 1;
        }
        int maxIndex = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1])
                return i;
            else if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        if (nums[nums.length-1] > max)
            return nums.length-1;
        return maxIndex;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
    Memory Usage: 40 MB, less than 5.97% of Java online submissions for Find Peak Element.
*/
