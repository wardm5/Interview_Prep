//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a non-empty, singly linked list with head node head, return a middle node
of linked list.

If there are two middle nodes, return the second middle node.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) check for null input
    2) create fast and slow pointers
    3) while fast.next and fast.next.next does not equal null
        4) set slow to slow.next
        5) set fast to fast.next.next
    6) check if fast.next is null, if so, then return slow
    7) else return slow.next
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
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null)
            return slow;
        return slow.next;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
    Memory Usage: 36.9 MB, less than 7.84% of Java online submissions for Middle of the Linked List.
*/
