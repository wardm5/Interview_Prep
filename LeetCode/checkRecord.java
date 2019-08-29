/*
    551. Student Attendance Record I
    https://leetcode.com/problems/student-attendance-record-i/
 */
 
class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                l = 0;
            } else if (s.charAt(i) == 'L') {
                l++;
            } else {
                l = 0;
            }
            if (a > 1 || l > 2)
                return false;
        }
        return true;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Student Attendance Record I.
    Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Student Attendance Record I.
 */
