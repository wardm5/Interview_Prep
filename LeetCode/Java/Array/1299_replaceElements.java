//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array arr, replace every element in that array with the greatest element
among the elements to its right, and replace the last element with -1.

After doing so, return the array.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result int[] that will store values
    2) loop through the input array but from the end
    3) if the value of the index + 1 is greater than the array length, then place -1 into the end of res
    4) if not, then check the input array and res array for the biggest result, place it into res at the current index
    5) once loop is completed, return res
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i + 1 >= arr.length)
                res[i] = -1;
            else
                res[i] = Math.max(res[i+1], arr[i+1]);
        }
        return res;
    }
}

/*
    Runtime: 2 ms, faster than 31.47% of Java online submissions for Replace Elements with Greatest Element on Right Side.
    Memory Usage: 43.6 MB, less than 100.00% of Java online submissions for Replace Elements with Greatest Element on Right Side.
*/
