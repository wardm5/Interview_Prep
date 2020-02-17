//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
You're given strings J representing the types of stones that are jewels, and S
representing the stones you have.  Each character in S is a type of stone you
have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are
letters. Letters are case sensitive, so "a" is considered a different type
of stone from "A".

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create set to store characters, count for result
    2) loop through your stones, add chars into set
    3) loop through the other rocks
    3) if set contains that rock, then it is a jewel and you increment count
    4) return count
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++)
            set.add(J.charAt(i));
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i)))
                count++;
        }
        return count;
    }
}

/*
    Runtime: 1 ms, faster than 86.04% of Java online submissions for Jewels and Stones.
    Memory Usage: 38.4 MB, less than 5.05% of Java online submissions for Jewels and Stones.
*/
