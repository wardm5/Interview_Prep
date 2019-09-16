/*
    141. Linked List Cycle
    https://leetcode.com/problems/linked-list-cycle/
 */
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
    Memory Usage: 37.5 MB, less than 96.43% of Java online submissions for Linked List Cycle.
 */
