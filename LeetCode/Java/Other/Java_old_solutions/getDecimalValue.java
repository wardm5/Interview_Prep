/*
    1290. Convert Binary Number in a Linked List to Integer
    https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
 
class Solution {
    int res = 0;
    public int getDecimalValue(ListNode head) {
        helper(head);
        return res;
    }
    public int helper(ListNode head) {
        if (head == null)
            return 0;
        else if (head.val == 1) {
            int exp = helper(head.next) ;
            res += Math.pow(2, exp);
            return exp + 1;
        } else 
            return helper(head.next) + 1;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
    Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
 */
