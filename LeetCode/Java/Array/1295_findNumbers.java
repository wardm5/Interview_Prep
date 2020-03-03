//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array nums of integers, return how many of them contain an even number
of digits.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create count variable
    2) loop through nums array
    3) convert number to string
    4) check length, if even, increment count
    5) return count

    Revised answer...
    1) create count variable
    2) loop through array of numbers
    3) check number with sepreate method
    4) checkNum method should:
        4.1) create count variable
        4.2) while loop the number is greater than 0
        4.3) increment count
        4.4) divide number by 10
        4.5) once complete, return if the count is divisible by 2
    5) finally return the count
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // String temp = nums[i] + "";
            if (checkNum(nums[i]))
                count++;
        }
        return count;
    }
    public boolean checkNum(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return (count % 2 == 0);
    }
}

/*
    Runtime: 1 ms, faster than 95.43% of Java online submissions for Find Numbers with Even Number of Digits.
    Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
*/
