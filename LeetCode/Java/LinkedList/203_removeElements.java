//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
203. Remove Linked List Elements
Easy

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) while the head is the value, just keep moving the head to the next node
    2) create temp node, create prior node
    3) while the temp is not null
        3.1) if the temp's val is equal to the val, then set prior's next to temps's next, increment temp, continue
        3.2) else set prior to temp, set temp to temp's next
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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        ListNode prior = null;
        while (temp != null) {
            if (temp.val == val) {
                prior.next = temp.next;
                temp = temp.next;
                continue;
            }
            prior = temp;
            temp = temp.next;
        }
        return head;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.
    Memory Usage: 42.1 MB, less than 6.35% of Java online submissions for Remove Linked List Elements.
*/
