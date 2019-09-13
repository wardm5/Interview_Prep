/*
    142. Linked List Cycle II
    https://leetcode.com/problems/linked-list-cycle-ii/
 */
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode curr = head;
        // HashSet<ListNode> set = new HashSet<>();
        // while (curr!= null) {
        //     if (set.contains(curr)) return curr;
        //     set.add(curr);
        //     curr = curr.next;
        // }
        // return null;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }  
        }
        return null;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
    Memory Usage: 34.8 MB, less than 71.58% of Java online submissions for Linked List Cycle II.
 */
