//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create StringBuilder to store result
    2) create map to store characters to freq
    3) loop through input, place characters and freqs into map
    4) create tree map, place freqs to char into the map
    5) finally, go through each of the freqs in the map and the characters and place into StringBuilder
    6) return stringbuilder as string
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String frequencySort(String s) {
        if (s.length() <=2)
            return s;
        StringBuilder build = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)-1);
        TreeMap<Integer, List<Character>> freqToCharMap = new TreeMap<>();
        for (char temp : map.keySet()) {
            List<Character> tempList = freqToCharMap.getOrDefault(map.get(temp), new ArrayList<>());
            tempList.add(temp);
            freqToCharMap.put(map.get(temp), tempList);
        }
        for (int key : freqToCharMap.keySet()) {
            List<Character> tempArr = freqToCharMap.get(key);
            for (int i = 0; i < tempArr.size(); i++) {
                for (int j = 0; j < Math.abs(key); j++)
                    build.append(tempArr.get(i));
            }
        }
        return build.toString();
    }
}

/*
    Runtime: 16 ms, faster than 57.95% of Java online submissions for Sort Characters By Frequency.
    Memory Usage: 42.7 MB, less than 7.41% of Java online submissions for Sort Characters By Frequency.
*/
