/*
    976. Largest Perimeter Triangle
    https://leetcode.com/problems/largest-perimeter-triangle/
 */

class Solution {
    // Assuming a <= b <= c, we should have a + b > c
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            int c = A[i];
            int a = A[i - 2];
            int b = A[i - 1];
            if (a + b > c) return a + b + c;
        }
        return 0;
    }
}

/*
    Runtime: 9 ms, faster than 97.17% of Java online submissions for Largest Perimeter Triangle.
    Memory Usage: 38.1 MB, less than 99.76% of Java online submissions for Largest Perimeter Triangle.
 */
