/*
    922. Sort Array By Parity II
    https://leetcode.com/problems/sort-array-by-parity-ii/
 */

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int odd = 1;
        int even = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[even] = A[i];
                even += 2;
            } else {
                result[odd] = A[i];
                odd += 2;
            }
        }
        return result;
    }
}

/*
    Runtime: 2 ms, faster than 99.72% of Java online submissions for Sort Array By Parity II.
    Memory Usage: 41.8 MB, less than 74.77% of Java online submissions for Sort Array By Parity II.
 */
