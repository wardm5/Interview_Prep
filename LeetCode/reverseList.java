/*
    206. Reverse Linked List
    https://leetcode.com/problems/reverse-linked-list/
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    Memory Usage: 36.9 MB, less than 98.92% of Java online submissions for Reverse Linked List.
 */
