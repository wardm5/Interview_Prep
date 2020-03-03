//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a string text, you want to use the characters of text to form as many
instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of
instances that can be formed.

Example 1:
Input: text = "nlaebolko"
Output: 1

Example 2:
Input: text = "loonbalxballpoon"
Output: 2

Example 3:
Input: text = "leetcode"
Output: 0

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create map
    2) loop through text, place items into map with the freq
    3) create string of balon
    4) create int min variable to store low point
    5) loop through ballon letters
        5.1) if the map doesnt contain the letter, return 0
        5.2) if the map contains o or l, then get the counts divided by 2 and check against min
        5.3) else check rest, get their counts and check against min
    6) return min
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    // public int maxNumberOfBalloons(String text) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     for (int i = 0; i < text.length(); i++)
    //         map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
    //     String bal = new StringBuilder("balon").toString();
    //     int min = Integer.MAX_VALUE;
    //     for (int i = 0; i < bal.length(); i++) {
    //         if (!map.containsKey(bal.charAt(i)))
    //             return 0;
    //         int tempMin;
    //         if (bal.charAt(i) == 'o' || bal.charAt(i) == 'l')
    //             tempMin = map.get(bal.charAt(i))/2;
    //         else
    //             tempMin = map.get(bal.charAt(i));
    //         if (tempMin == 0)
    //             return 0;
    //         if (min > tempMin)
    //             min = tempMin;
    //     }
    //     return min;
    // }
    public int maxNumberOfBalloons(String text) {
        int[] letterCount = new int[26];
        for(char c : text.toCharArray())
            letterCount[c - 'a']++;

        int min = letterCount[1]; // b count
        min = Math.min(min,letterCount[0]); // a count
        min = Math.min(min,letterCount[11]/2); // l/2 count
        min = Math.min(min,letterCount[14]/2); // o/2 count
        min = Math.min(min,letterCount[13]); // n count

        return min;
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Number of Balloons.
    Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Maximum Number of Balloons.
*/
