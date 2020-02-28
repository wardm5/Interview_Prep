//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single
digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number
0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create helper that takes two nodes, and a carry value
    2) if the nodes are empty and the carry is zero, then return 0
    3) if the nodes are null and carry exists, then create new node with carry value
    4) if the left is null, then return new temp with right and carry value
    5) if the right is null, then return new temp with the left and carry value
    6) else return the temp with the left value right value and carry value
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1, l2, 0);
    }
    public ListNode helper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0)
            return null;
        else if (l1 == null && l2 == null) {
            ListNode temp = new ListNode(carry);
            return temp;
        } else if (l1 == null && l2 != null) {
            int tempCarry = 0;
            if (l2.val + carry >= 10)
                tempCarry = 1;
            ListNode temp = new ListNode((l2.val + carry) % 10);
            temp.next = helper(null, l2.next, tempCarry);
            return temp;
        } else if (l1 != null && l2 == null) {
            int tempCarry = 0;
            if (l1.val + carry >= 10)
                tempCarry = 1;
            ListNode temp = new ListNode((l1.val + carry) % 10);
            temp.next = helper(l1.next, null, tempCarry);
            return temp;
        } else {
            int tempCarry = 0;
            if (l1.val + l2.val + carry >= 10)
                tempCarry = 1;
            ListNode temp = new ListNode((l1.val + l2.val + carry) % 10);
            temp.next = helper(l1.next, l2.next, tempCarry);
            return temp;
        }
    }
}

/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
    Memory Usage: 40.8 MB, less than 94.98% of Java online submissions for Add Two Numbers.
*/
