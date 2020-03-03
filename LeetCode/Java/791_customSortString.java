//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
S and T are strings composed of lowercase letters. In S, no letter occurs more
than once.

S was sorted in some custom order previously. We want to permute the characters
of T so that they match the order that S was sorted. More specifically, if x occurs
before y in S, then x should occur before y in the returned string.

Return any permutation of T (as a string) that satisfies this property.

Example :
Input:
S = "cba"
T = "abcd"
Output: "cbad"
Explanation:
"a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create map to store characters and counts
    2) place all of T's characters and freq into map
    3) create StringBuilder
    4) loop through each of S's characters
        4.1) if the map does not contain the character, continue
        4.2) for the count of the item, add to the StringBuilder
        4.3) remove the item from the map
    5) for each of the left over items in the map:
        5.1) add the character the count of the many items
    6) return the string
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public String customSortString(String S, String T) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : T.toCharArray())
            map.put(c, map.getOrDefault(c, 0) +1);
        StringBuilder build = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (!map.containsKey(c))
                continue;
            for (int i = 0; i < map.get(c); i++)
                build.append(c);
            map.remove(c);
        }
        for (char c : map.keySet()) {
            for (int i = 0; i < map.get(c); i++)
                build.append(c);
        }
        return build.toString();
    }
}

/*
    Runtime: 1 ms, faster than 60.47% of Java online submissions for Custom Sort String.
    Memory Usage: 37.8 MB, less than 6.06% of Java online submissions for Custom Sort String.
*/
