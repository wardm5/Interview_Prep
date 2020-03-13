//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
645. Set Mismatch
Easy

The set S originally contains numbers from 1 to n. But unfortunately, due to the
data error, one of the numbers in the set got duplicated to another number in the
set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error.
Your task is to firstly find the number occurs twice and then find the number
that is missing. Return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create duplicate variable, sum variable, total sum variable
    2) create set
    3) loop through each item in input array
        3.1) if the set contains the number, then it is a dup, then set dup
        3.2) add num to set
        3.3) increment total with i + 1
        3.4) increment sum with num
    4) return the new array with duplicate and the total sum minus sum minus duplicate
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = 0;
        int sum = 0;
        int totalSum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                dup = nums[i];
            set.add(nums[i]);
            totalSum += (i + 1);
            sum += nums[i];
        }
        return new int[] {dup, totalSum - (sum-dup)};
    }
}

/*
    Runtime: 11 ms, faster than 40.43% of Java online submissions for Set Mismatch.
    Memory Usage: 43.1 MB, less than 14.29% of Java online submissions for Set Mismatch.
*/
