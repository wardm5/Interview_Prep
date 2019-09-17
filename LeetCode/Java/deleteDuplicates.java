/*
    83. Remove Duplicates from Sorted List
    https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head; 
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val)
                curr.next = curr.next.next;
            else 
                curr = curr.next;
        }
        return head;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
    Memory Usage: 37 MB, less than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
 */
