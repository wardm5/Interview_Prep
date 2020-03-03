/*
    387. First Unique Character in a String
    https://leetcode.com/problems/first-unique-character-in-a-string/
 */

class Solution {
    public int firstUniqChar(String s) {
        // for(int i=0;i<s.length();i++){
        //     if(s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))){
        //         return i;
        //     }
        // }
        // return -1;
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[(int)s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[(int)s.charAt(i)] == 1) 
                return i;
        }
        return -1;
    }
}

/*
    Runtime: 9 ms, faster than 79.68% of Java online submissions for First Unique Character in a String.
    Memory Usage: 37.7 MB, less than 99.29% of Java online submissions for First Unique Character in a String.
 */
