//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
1346. Check If N and Its Double Exist
Easy

Given an array arr of integers, check if there exists two integers N and M such
that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]


Example 1:
Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.

Example 2:
Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.

Example 3:
Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create set
    2) loop through input array
        2.1) if the set contains either the double of the number or the number divided by two, then return true
        2.2) add the number to the set
    3) return false
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Double>  set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains((double)arr[i] * 2.0) || set.contains((double)arr[i]/2.0))
                return true;
            set.add((double)arr[i]);
        }
        return false;
    }
}

/*
    Runtime: 1 ms, faster than 99.31% of Java online submissions for Check If N and Its Double Exist.
    Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for Check If N and Its Double Exist.
*/
