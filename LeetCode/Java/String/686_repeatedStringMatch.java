//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
686. Repeated String Match
Easy

Given two strings A and B, find the minimum number of times A has to be repeated
such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring
of it; and B is not a substring of A repeated two times ("abcdabcd").

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create StringBuilder
    2) create count variable
    3) while the build length is less than b's length, add string a to the StringBuilder, increment count
    4) if b is indexed in stringbuilder, then return count
    5) eles append a, check if the string b is indexed in the builder, if so return count +1
    6) return -1 for errror
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder build = new StringBuilder(A);
        int count = 1;
        while (build.length() < B.length()) {
            build.append(A);
            count++;
        }
        if(build.indexOf(B)>=0)
            return count;
        if(build.append(A).indexOf(B)>=0)
            return count+1;
        return -1;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Outermost Parentheses.
    Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
*/
