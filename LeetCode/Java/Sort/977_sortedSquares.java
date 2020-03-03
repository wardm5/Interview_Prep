//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array of integers A sorted in non-decreasing order, return an array of
the squares of each number, also in sorted non-decreasing order.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach - Two pointers
//-------------------------------------------------------------------------------

/*
    1) create left and right pointers, result array, and index
    2) while the left and right are less or equal to each other
        2.1) if the left sqaured value is greater than the right, then place into the result at the end index, update values
        2.2) if the right squared value is greater, then place the result in the end index, update values
    3) return result
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length-1;
        int[] res = new int[A.length];
        int index = A.length-1;
        while (left <= right) {
            if (A[left] * A[left] > A[right] * A[right]) {
                res[index] = A[left] * A[left];
                index--;
                left++;
                continue;
            }
            if (A[left] * A[left] <= A[right] * A[right]) {
                res[index] = A[right] * A[right];
                index--;
                right--;
                continue;
            }
        }
        return res;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
    Memory Usage: 42 MB, less than 89.63% of Java online submissions for Squares of a Sorted Array.
*/
