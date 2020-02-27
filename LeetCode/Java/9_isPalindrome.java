//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Determine whether an integer is a palindrome. An integer is a palindrome when it
reads the same backward as forward.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if input is less than zero, then return false
    2) create queue
    3) return resursive method
        3.1) if x is less than or equal to 0 , return true;
        3.2) add x mod 10 to queue
        3.3) get boolean value from recursive function
        3.4) if x mod 10 equals the queue's removed value, return true and check
        3.5) return false 
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        Queue<Integer> q = new LinkedList<>();
        return helper(x, q);
    }
    public boolean helper(int x, Queue<Integer> q) {
        if (x <= 0)
            return true;
        q.add(x % 10);
        boolean check = helper(x / 10, q);
        if ((x%10) == q.remove())
            return (true && check);
        return false;
    }
}

/*
    Runtime: 9 ms, faster than 30.66% of Java online submissions for Palindrome Number.
    Memory Usage: 40.8 MB, less than 5.02% of Java online submissions for Palindrome Number.
*/
