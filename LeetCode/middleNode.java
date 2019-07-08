/*
    876. Middle of the Linked List
    https://leetcode.com/problems/middle-of-the-linked-list/
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;  // head of list
        ListNode temp = head;  // temp, which will go ahead of the head of the list by 2X
        while (temp != null && temp.next != null) {  // while temp and temp next are not empty
            curr = curr.next;  // set curr to next item in linked list
            temp = temp.next.next;  // set temp to next next item in the list
        }
        return curr;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
    Memory Usage: 33.9 MB, less than 100.00% of Java online submissions for Middle of the Linked List.
 */
