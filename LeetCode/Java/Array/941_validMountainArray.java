//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
941. Valid Mountain Array
Easy

Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]

Example 1:
Input: [2,1]
Output: false

Example 2:
Input: [3,5,5]
Output: false

Example 3:
Input: [0,3,2,1]
Output: true

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check if the length is less than 1 or if the first item is greater than the second, otherwise return false
    2) create curr variable to keep track of position in the mountain array
    3) while the curr+1 is greater than the length of the array and the current item is less than the next item, increment curr
    4) check if the curr is equal to the length or the item is equal to the prior item
    5) while the current plus one is less than the length or the curr is more than the next item
    6) return if the current variable equals the length -1 (zero based index)
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length <= 1 || A[0] > A[1])
            return false;
        int curr = 0;
        while (curr+1 < A.length && A[curr] < A[curr+1])
            curr++;
        if (curr == A.length-1 || A[curr-1] == A[curr])
            return false;
        while (curr + 1 < A.length && A[curr] > A[curr+1])
            curr++;
        return (curr == A.length-1);
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
    Memory Usage: 40.7 MB, less than 72.22% of Java online submissions for Valid Mountain Array.
*/
