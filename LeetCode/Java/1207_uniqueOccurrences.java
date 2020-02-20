//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given an array of integers arr, write a function that returns true if and only if
the number of occurrences of each value in the array is unique.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) Create hashmap to store the number and occurances
    2) loop through input array
        3) place item and count into map
    4) create set
    5) loop through hashmap
        6) if the item in the set matches the map's number of occurance, return false
        7) else, add number of occurances to set
    8) return true (since it should be true at this point)
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ;i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        HashSet<Integer> countSet = new HashSet<>();
        for (int temp : map.keySet()) {
            if (!countSet.contains(map.get(temp)))
                countSet.add(map.get(temp));
            else
                return false;
        }
        return true;
    }
}

/*
    Runtime: 1 ms, faster than 99.66% of Java online submissions for Unique Number of Occurrences.
    Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.
*/
