//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array nums and a value val, remove all instances of that value in-place
and return the new length.

Do not allocate extra space for another array, you must do this by modifying the
input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the
new length.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create two integers storing left and right
    2) while left is less or equal to right
        3.1) if the left number is not a removeable item, increment left
        3.2) if the right number is equal to removable item, decrement right
        3.3) set left to the right number,increment left, decrement right
    3) return left
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] != val) {
                left++;
                continue;
            }
            if (nums[right] == val) {
                right--;
                continue;
            }
            nums[left] = nums[right];
            left++;
            right--;
        }
        return left;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
    Memory Usage: 38 MB, less than 5.05% of Java online submissions for Remove Element.
*/
