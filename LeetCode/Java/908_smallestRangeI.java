//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array A of integers, for each integer A[i] we may choose any x with
-K <= x <= K, and add x to A[i].

After this process, we have some array B.

Return the smallest possible difference between the maximum value of B and the
minimum value of B.



Example 1:
Input: A = [1], K = 0
Output: 0
Explanation: B = [1]

Example 2:
Input: A = [0,10], K = 2
Output: 6
Explanation: B = [2,8]

Example 3:
Input: A = [1,3,6], K = 3
Output: 0
Explanation: B = [3,3,3] or B = [4,4,4]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create min and max variables
    2) loop through the input array
        2.1) if the value at A is less than min, replace min
        2.2) if the value at A is greater than max, then replace max
    3) update min and max with greatest K value, see if max - min happens to be negative, if so, return 0
    4) else return max - min
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (min > A[i])
                min = A[i];
            if (max < A[i])
                max = A[i];
        }
        min = min + K;
        max = max - K;
        if (max - min < 0)
            return 0;
        return max - min;
    }
}

/*
    Runtime: 1 ms, faster than 99.79% of Java online submissions for Smallest Range I.
    Memory Usage: 41.9 MB, less than 7.69% of Java online submissions for Smallest Range I.
*/
