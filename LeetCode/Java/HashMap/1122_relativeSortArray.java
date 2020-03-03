//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all
elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1
are the same as in arr2.  Elements that don't appear in arr2 should be placed
at the end of arr1 in ascending order.

Example 1:
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create tree map to store the items
    2) place each item of the array into the map
    3) create result array and count
    4) loop through each item in the smaller array, then loop through the map's values to place the key values into the result array
    5) loop through the rest of the map to place into the array
    6) return result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++)
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        int[] res = new int[arr1.length];
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < map.get(arr2[i]); j++) {
                res[count] = arr2[i];
                count++;
            }
            map.remove(arr2[i]);
        }
        for (int key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                res[count] = key;
                count++;
            }
        }
        return res;
    }
}

/*
    Runtime: 4 ms, faster than 35.81% of Java online submissions for Relative Sort Array.
    Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for Relative Sort Array.
*/
