//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci
sequence, such that each number is the sum of the two preceding ones, starting
from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if n is 0 then return 0
    2) if n is 1, then return 1
    3) create array to store values`
    4) loop through array up to n
    5) each iteration, place into the current index the values of array[i-1] + array[i-2]
    6) return nth item in array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int fib(int N) {
        if (N <= 0)
            return 0;
        if (N == 1)
            return 1;
        int[] res = new int[N+1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= N; i++)
            res[i] = res[i-1] + res[i-2];
        return res[N];
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
    Memory Usage: 36.3 MB, less than 5.51% of Java online submissions for Fibonacci Number.
*/
