//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes
9, and 9 becomes 6).

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create count, max count, and tempNum variables
    2) while the number is greater than 0
    3) if the number % 10 equals 6, then update the max count
    4) once the check is done, divide number by 10
    5) once loop is completed, check to see if the max count is above 0
    6) if it is, then get the 10^ power of max count * 3 to add the extra value
    7) return num + this new value added
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public int maximum69Number (int num) {
        int tempNum = num;
        int count = 0;
        int maxCount = 0;
        while (tempNum > 0) {
            count++;
            if (tempNum % 10 == 6 && count > maxCount)
                maxCount = count;
            tempNum /= 10;
        }
        if (maxCount == 0)
            return num;
        return (num + (int)Math.pow(10,maxCount - 1) * 3);
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum 69 Number.
    Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Maximum 69 Number.
*/
