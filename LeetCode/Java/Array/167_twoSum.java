//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array of integers that is already sorted in ascending order, find two
numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add
up to the target, where index1 must be less than index2.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create start and end variables
    2) while start is less than end
        3) if start + end is larger than target, then decrement end, continue
        4) if start + end is smaller than target, then increment start, continue
        5) else return new int array with start and end as the indexes
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] > target) {
                end--;
                continue;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
                continue;
            } else if (numbers[start] + numbers[end] == target)
                return new int[] {start + 1, end + 1};
        }
        return new int[2];
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
    Memory Usage: 42.4 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.
*/
