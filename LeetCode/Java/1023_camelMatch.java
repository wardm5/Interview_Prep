//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
1023. Camelcase Matching
Medium

A query word matches a given pattern if we can insert lowercase letters to the 
pattern word so that it equals the query. (We may insert each character at any 
position, and may insert 0 characters.)

Given a list of queries, and a pattern, return an answer list of booleans, where 
answer[i] is true if and only if queries[i] matches the pattern.

Example 1:
Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
Output: [true,false,true,true,false]
Explanation: 
"FooBar" can be generated like this "F" + "oo" + "B" + "ar".
"FootBall" can be generated like this "F" + "oot" + "B" + "all".
"FrameBuffer" can be generated like this "F" + "rame" + "B" + "uffer".

Example 2:
Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBa"
Output: [true,false,true,false,false]
Explanation: 
"FooBar" can be generated like this "Fo" + "o" + "Ba" + "r".
"FootBall" can be generated like this "Fo" + "ot" + "Ba" + "ll".

Example 3:
Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBaT"
Output: [false,true,false,false,false]
Explanation: 
"FooBarTest" can be generated like this "Fo" + "o" + "Ba" + "r" + "T" + "est".

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create result array
    2) loop through each word
        2.1) for each word, create index
        2.2) loop through word, check if the value matches the pattern, if so, increment pattern pointer
        2.3) if not, check and make sure the character is not captialized else return false
        2.4) return a check if the pattern pointer matches the pattern length once loop is completed, return true if it does
    3) return result array
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        for (String word : queries)
            result.add(checkPattern(word, pattern));
        return result;    
    }
    
    private Boolean checkPattern(String word, String pattern) {
        int index = 0;
        for (char c : word.toCharArray()) {
            if (index < pattern.length() && c == pattern.charAt(index))
                index++;
            else if (Character.isUpperCase(c))
                return false;
        }
        return pattern.length() == index;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Camelcase Matching.
    Memory Usage: 37.7 MB, less than 14.29% of Java online submissions for Camelcase Matching.
*/
