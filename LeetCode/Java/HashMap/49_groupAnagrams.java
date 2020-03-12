//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
49. Group Anagrams
Medium

Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1)  create hashmap to store the string to a list of strings
    2) for each string in the array
        2.1) sort the string
        2.2) check to see if the map contains it, otherwise pass back blank list
        2.3) add the unsorted string into list
    3) create result array
    4) loop through map
        4.1) for each string, place into final result array the array of strings stored in the map
    5) return result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String tempStr = new String(temp);
            List<String> tempList = map.getOrDefault(tempStr, new ArrayList<>());
            tempList.add(s);
            map.put(tempStr, tempList);
        }
        List<List<String>> result = new ArrayList<>();
        for (String str : map.keySet())
            result.add(map.get(str));
        return result;
    }
}

/*
    Runtime: 6 ms, faster than 97.92% of Java online submissions for Group Anagrams.
    Memory Usage: 45.7 MB, less than 33.92% of Java online submissions for Group Anagrams.
*/
