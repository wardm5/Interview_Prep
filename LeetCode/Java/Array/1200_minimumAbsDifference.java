//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
1200. Minimum Absolute Difference
Easy

Given an array of distinct integers arr, find all pairs of elements with the minimum 
absolute difference of any two elements. 

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] 
follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr

Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference 
equal to 1 in ascending order.

Example 2:
Input: arr = [1,3,6,10,15]
Output: [[1,3]]

Example 3:
Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]
-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result array
    2) create variable to keep track of min
    3) loop through array
        3.1) if the current item and the prior item subtacted from each other is less than min, create nw arraylist, add those items
        3.2) if they are not, then continue
    4) return result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i-1]) > min)
                continue;
            if (Math.abs(arr[i] - arr[i-1]) < min) {
                min = Math.abs(arr[i] - arr[i-1]);
                res = new ArrayList<>();
            }
            res.add(new ArrayList<>(Arrays.asList(arr[i-1], arr[i])));
        }
        return res;
    }
}

/*
    Runtime: 15 ms, faster than 68.97% of Java online submissions for Minimum Absolute Difference.
    Memory Usage: 56.5 MB, less than 100.00% of Java online submissions for Minimum Absolute Difference.
*/
