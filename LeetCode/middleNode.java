/*
    876. Middle of the Linked List
    https://leetcode.com/problems/middle-of-the-linked-list/submissions/
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            curr = curr.next;
            temp = temp.next.next;
        }
        return curr;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
    Memory Usage: 33.9 MB, less than 100.00% of Java online submissions for Middle of the Linked List.
 */
