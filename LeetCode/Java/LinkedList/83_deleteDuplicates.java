//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a sorted linked list, delete all duplicates such that each element appear
only once.

Example 1:
Input: 1->1->2
Output: 1->2

Example 2:
Input: 1->1->2->3->3
Output: 1->2->3

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) if the head is null, then return null
    2) set up current and prior nodes to keep track
    3) while the current node is not null:
        3.1) if the prior is null, then set prior to current, current to next
        3.2) if the current matches prior's value, then prior's next should be current's next, current should be current's next
        3.3) else set prior to current, current to current's next
    4) return head
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode curr = head;
        ListNode prior = null;
        while (curr != null) {
            if (prior == null) {
                prior = curr;
                curr = curr.next;
            } else if (curr.val == prior.val) {
                prior.next = curr.next;
                curr = curr.next;
            } else {
                prior = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
    Memory Usage: 40.9 MB, less than 7.14% of Java online submissions for Remove Duplicates from Sorted List.
*/
