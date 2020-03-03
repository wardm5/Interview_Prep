/*
    832. Flipping an Image
    https://leetcode.com/problems/flipping-an-image/
 */

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int start = 0;
        int end = A[0].length - 1;
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            int j = 0;
            while (j <= (length -1 - j)) {
                int a = A[i][j];
                int b = A[i][length - 1 - j];
                if (a == 1)
                    a = 0;
                else 
                    a = 1;
                if (b == 1)
                    b = 0;
                else
                    b = 1;
                A[i][j] = b;
                A[i][length - 1 - j] = a;
                j++;
            }
        }
        return A;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
    Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Flipping an Image.
 */
