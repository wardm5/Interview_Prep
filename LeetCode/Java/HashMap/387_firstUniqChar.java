//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string, find the first non-repeating character in it and return it's index.
If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create hashmap, loop through input string, store freqs to characters,
    2) loop through string again, if the count is 1, then return index
    3) return -1;
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int firstUniqChar(String s) {
        // LinkedHashMap<Character, List<Integer>> map = new LinkedHashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     List<Integer> temp = map.getOrDefault(s.charAt(i), new ArrayList<>());
        //     temp.add(i);
        //     map.put(s.charAt(i), temp);
        // }
        // for (char c : map.keySet()) {
        //     if (map.get(c).size() == 1)
        //         return map.get(c).get(0);
        // }
        // return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        // loop through list, keep track of freq
        for (int i = 0 ; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        // loop through list again, if you see item with freq 1, return that index
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        // return error
        return -1;
    }
}

/*
    Runtime: 25 ms, faster than 41.52% of Java online submissions for First Unique Character in a String.
    Memory Usage: 42.1 MB, less than 5.71% of Java online submissions for First Unique Character in a String.
*/
