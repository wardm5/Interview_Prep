//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array A of non-negative integers, return an array consisting of all
the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create start and end variables
    2) create while loop where start is less than end
    3) if the start index for the input array was even, increment start, then continue
    4) if the end index for the input array was not even, decrement end, then continue
    5) else swap the end and start values
    6) return input array with updated values
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            if (A[start] % 2 == 0) {
                start++;
                continue;
            } else if (A[end] % 2 != 0) {
                end--;
                continue;
            }
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
        }
        return A;
    }
}

/*
    Runtime: 1 ms, faster than 99.87% of Java online submissions for Sort Array By Parity.
    Memory Usage: 41.8 MB, less than 70.84% of Java online submissions for Sort Array By Parity.
*/
