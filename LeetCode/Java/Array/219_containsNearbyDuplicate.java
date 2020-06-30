//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
<Problem Statement>

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create map to store value to index
    2) for each ite in list
        2.1) if the map contains the number and the index for that number minus the current is less than or equal to k, return true
        2.2) else put the item and index into map
    3) return false if did not find a value
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Outermost Parentheses.
    Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
*/
