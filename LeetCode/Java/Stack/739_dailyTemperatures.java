//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
739. Daily Temperatures
Medium

Given a list of daily temperatures T, return a list such that, for each day in
the input, tells you how many days you would have to wait until a warmer temperature.
If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature
will be an integer in the range [30, 100].

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) Create stack
    2) push the first item into stack
    3) create result array
    4) loop through each item in the list, start at 1
        4.1) create temp array
        4.2) while the stack is not empty and the first item in the stack is less than the current item
            4.2.1) get temp into a variable from the first item in the stack
            4.2.2) set the res of that item to the temp's index
        4.3) push the current item into the stack including index and tempature
    5) return res
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<int[]> s = new Stack<>();
        s.push(new int[] {T[0], 0});
        int[] res = new int[T.length];
        for (int i = 1; i< T.length; i++) {
            int[] temp = new int[2];
            while (!s.isEmpty() && s.peek()[0] < T[i]) {
                temp = s.pop();
                res[temp[1]] = i-temp[1];
            }
            s.push(new int[] {T[i], i});
        }
        return res;
    }
}

/*
    Runtime: 15 ms, faster than 58.56% of Java online submissions for Daily Temperatures.
    Memory Usage: 49 MB, less than 5.09% of Java online submissions for Daily Temperatures.
*/
