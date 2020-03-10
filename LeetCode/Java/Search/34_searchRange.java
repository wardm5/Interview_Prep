//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array of integers nums sorted in ascending order, find the starting and
ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) Run two binary searches, one for the target, one for target + 1
    2) if left is less than nums length and the number in the array at the index is equal to target, return correct matrix
    3) else return the incorrect values
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

// Better solution:
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearchPos(nums, target);
        int right = binarySearchPos(nums, target + 1) - 1;
        if (left < nums.length && nums[left] == target)
            return new int[]{left, right};
        return new int[]{-1, -1};
    }
    // best way to do binary search
    private int binarySearchPos(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}


// Orginal solution:
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] {-1,-1};
        int start = binarySearch(nums, target);
        if (start == -1)
            return new int[] {-1,-1};
        for (int i = start; i < nums.length; i++) {
            if (nums[i] != target)
                return new int[] {start, i-1};
        }
        return new int[] {start, nums.length-1};
    }
    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = ((right - left) / 2) + left;
            if (mid >= nums.length)
                return -1;
            if (mid >= 1 && nums[mid] == target && nums[mid-1] != target)
                return mid;
            if (mid == 0 && nums[mid] == target)
                return 0;
            if (nums[mid] >= target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Outermost Parentheses.
    Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
*/
