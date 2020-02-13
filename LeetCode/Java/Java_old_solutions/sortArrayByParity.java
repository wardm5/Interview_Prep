/*
    905. Sort Array By Parity
    https://leetcode.com/problems/sort-array-by-parity/
 */
 
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int front = 0;
        int last = A.length;
        int[] arr = new int[last];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[front] = A[i];
                front += 1;
            } else {
                arr[last - 1] = A[i];
                last -= 1;
            }
        }
        return arr;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
    Memory Usage: 40.5 MB, less than 90.97% of Java online submissions for Sort Array By Parity.
 */
