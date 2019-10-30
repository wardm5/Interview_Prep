/*
    1207. Unique Number of Occurrences
    https://leetcode.com/problems/unique-number-of-occurrences/
*/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++ ) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);            
        }
        HashSet<Integer> set = new HashSet<>();
        for (int value : map.values()) {
            if (set.contains(value))
                return false;
            set.add(value);
        }
        return true;
    }
}

/*
    Runtime: 2 ms, faster than 88.01% of Java online submissions for Unique Number of Occurrences.
    Memory Usage: 35.6 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.
*/
