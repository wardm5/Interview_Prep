//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
24. Swap Nodes in Pairs
Medium

Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.


Example:
Given 1->2->3->4, you should return the list as 2->1->4->3.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) put all nodes into arraylist
    2) for each pair of nodes, swap them, loop through arraylist
    3) return head
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
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        List<ListNode> list = new ArrayList<>();
        helper(list, head);

        if (list.size() == 1)
            return head;
        else
            head = list.get(1);
        for (int i = 1; i < list.size(); i+=2) {
            ListNode curr = list.get(i);
            ListNode prior = list.get(i-1);
            curr.next = prior;
            if (i+2 < list.size())
                prior.next = list.get(i+2);
            else if (i+1 < list.size())
                prior.next = list.get(i+1);
            else
            prior.next = null;
        }
        return head;
    }
//   list = 1, 2, 3, 4
    public void helper(List<ListNode> list, ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
    Memory Usage: 37 MB, less than 5.50% of Java online submissions for Swap Nodes in Pairs.
*/
