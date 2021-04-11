//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

Example 1:

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
Example 2:

Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------


class Solution {
    public int countOdds(int low, int high) {
        if (low % 2 == 0)
            ++low;
        if (high % 2 == 0)
            --high;
        return (high - low + 2) / 2;
        // int count = 0;
        // for (int i = low; i <= high ; i++)
        //     if (i % 2 == 1)
        //         count++;
        // return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Odd Numbers in an Interval Range.
    Memory Usage: 37.9 MB, less than 9.02% of Java online submissions for Count Odd Numbers in an Interval Range.
*/
