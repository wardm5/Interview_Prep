/*
    1134. Armstrong Number
    https://leetcode.com/problems/armstrong-number/
 */

class Solution {
    public boolean isArmstrong(int N) {
        int j = N;
        int pow = 0;
        while (j > 0) {
            pow++;
            j /=10;
        }
        int n = N;
        int sum = 0;
        while (N > 0) {
            int temp = N % 10;
            sum += Math.pow(temp, pow);
            N /= 10;
        }
        return (sum == n);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Armstrong Number.
    Memory Usage: 33.1 MB, less than 100.00% of Java online submissions for Armstrong Number.
 */
