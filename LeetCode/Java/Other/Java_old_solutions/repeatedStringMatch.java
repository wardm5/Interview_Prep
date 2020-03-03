/*
    686. Repeated String Match
    https://leetcode.com/problems/repeated-string-match/
 */

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
    Runtime: 95 ms, faster than 78.24% of Java online submissions for Repeated String Match.
    Memory Usage: 35.7 MB, less than 99.66% of Java online submissions for Repeated String Match.
 */

