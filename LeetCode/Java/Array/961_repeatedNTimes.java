  
//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
961. N-Repeated Element in Size 2N Array
Easy

In a array A of size 2N, there are N+1 unique elements, and exactly one of these 
elements is repeated N times.

Return the element repeated N times.

Example 1:
Input: [1,2,3,3]
Output: 3

Example 2:
Input: [2,1,2,5,3,2]
Output: 2

Example 3:
Input: [5,1,5,2,5,3,5,4]
Output: 5

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create set
    2) loop through list, if the item is in the set, return it
    3) otherwise, return first item
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i]))
                return A[i];
            set.add(A[i]);
        }
        return A[0];
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
    Memory Usage: 42.1 MB, less than 9.87% of Java online submissions for N-Repeated Element in Size 2N Array.
*/
