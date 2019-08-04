/*
    1137. N-th Tribonacci Number
    https://leetcode.com/problems/n-th-tribonacci-number/submissions/
 */

class Solution {
    public int tribonacci(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 1)
            return 2;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i -1];
        }
        return arr[n];
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for N-th Tribonacci Number.
    Memory Usage: 33 MB, less than 100.00% of Java online submissions for N-th Tribonacci Number.
 */
