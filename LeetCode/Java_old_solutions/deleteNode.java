/*
    237. Delete Node in a Linked List
    https://leetcode.com/problems/delete-node-in-a-linked-list/
 */

class Solution {
    ListNode head;
    public void deleteNode(ListNode node) {
        ListNode pre = node;
        while(node.next != null){
            node.val = node.next.val;
            pre = node;
            node = node.next;
        }
        pre.next = null;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
    Memory Usage: 37 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.
 */
