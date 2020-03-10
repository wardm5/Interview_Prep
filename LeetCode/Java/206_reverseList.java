//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
206. Reverse Linked List
Easy

Reverse a singly linked list.

Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create prior, curr, fast variables
    2) loop through linked list while curr does not equal null
        2.1) set fast to curr
        2.2) set curr.next to prior
        2.3) set prior to current
        2.4) set current to fast
    3) return prior (since it would be at the last currnet position)
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
    public ListNode reverseList(ListNode head) {
        ListNode prior = null;
        ListNode curr = head;
        ListNode fast = null;
        while (curr != null) {
            fast = curr.next;
            curr.next = prior;
            prior = curr;
            curr = fast;
        }
        return prior;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    Memory Usage: 38.6 MB, less than 5.04% of Java online submissions for Reverse Linked List.
*/
