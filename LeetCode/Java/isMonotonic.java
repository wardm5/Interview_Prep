/*
    896. Monotonic Array
    https://leetcode.com/problems/monotonic-array/
 */

class Solution {
    public boolean isMonotonic(int[] A) {
        int begin = A[0];
        boolean asc = !(begin > A[A.length -1]);
        for (int i = 1; i < A.length; i++) {
            if (asc && begin > A[i])
                return false;
            if (!asc && begin < A[i])
                return false;
            begin = A[i];
        }
        return true;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Monotonic Array.
    Memory Usage: 49.5 MB, less than 100.00% of Java online submissions for Monotonic Array.
 */
