//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a non-empty array of integers, every element appears twice except for one.
Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it
without using extra memory?

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create set
    2) while number is not 1
        4) if set contains input, return false
        5) add input to set
        6) get squared value of input's digits
    7) return if input == 1
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean isHappy(int input) {
        HashSet<Integer> set = new HashSet<>();
        while (input != 1) {
            if (set.contains(input))
                return false;
            set.add(input);
            input = squared(input);
        }
        return (input == 1);
    }
      public static int squared(int val) {
        int result  =0;
        while (val > 0) {
          int tempVal = val % 10;  // 9  1
          result += tempVal * tempVal; //81 + 1 = 82
          val /= 10;  //
        }
        return result;
      }
}
/*
    Runtime: 1 ms, faster than 95.22% of Java online submissions for Happy Number.
    Memory Usage: 36.7 MB, less than 6.06% of Java online submissions for Happy Number.
*/
