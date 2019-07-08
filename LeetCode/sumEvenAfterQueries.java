/*
    985. Sum of Even Numbers After Queries
    https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] arr = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {  // quick loop to get initial sum value.
            if (A[i] % 2 == 0) 
                sum+= A[i];
        }
        for (int i = 0; i < queries.length; i++) {
            int old = A[queries[i][1]];    // calculate old val
            A[queries[i][1]] = A[queries[i][1]] + queries[i][0];   // update array
            int val = A[queries[i][1]];  // calculate new val
            if (old % 2 == 0 &&  val % 2 == 0) {   // if old is even and is still even
                sum = sum + (val - old);  // add difference
            } else if (old % 2 == 0 && val % 2 != 0) {  // if old is even and goes odd
                sum -= old;  // subtract the old val
            } else if (old %  2 != 0 && val % 2 == 0) {  // if old is odd and now even
                sum += val;  //  add the val to the sum
            }
            arr[i] = sum;   // update array
        }
        return arr;  // return array
    }
}

/*
    Runtime: 4 ms, faster than 97.09% of Java online submissions for Sum of Even Numbers After Queries.
    Memory Usage: 58.8 MB, less than 84.28% of Java online submissions for Sum of Even Numbers After Queries.
 */
