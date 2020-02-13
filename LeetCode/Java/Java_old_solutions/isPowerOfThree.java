/*
    326. Power of Three
    https://leetcode.com/problems/power-of-three/
 */

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        while (n > 1) {
            if (n % 3 != 0)
                return false;
            n /= 3;
        }
        return true;
    }
}

/*
    Runtime: 10 ms, faster than 100.00% of Java online submissions for Power of Three.
    Memory Usage: 35.9 MB, less than 6.25% of Java online submissions for Power of Three.
 */
