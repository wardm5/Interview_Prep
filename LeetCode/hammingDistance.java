/*
    461. Hamming Distance
    https://leetcode.com/problems/hamming-distance/
 */

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x > 0 || y > 0) {
            if (x % 2  != y % 2)
                count++;
            x /= 2;
            y /= 2;
        }
        return count;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
    Memory Usage: 33.4 MB, less than 5.09% of Java online submissions for Hamming Distance.
 */
