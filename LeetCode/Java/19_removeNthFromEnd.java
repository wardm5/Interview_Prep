//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given a linked list, remove the n-th node from the end of list and return its head.

Example:
Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) set temp to head
    2) create res int array which stores the n integer
    3) call recrusive helper and return value
        3.1) if the temp is null, return null
        3.2) create temp node from the helper method
        3.3) subtract from the int result, if the result is 0, then return the temp node
        3.4) set current node's next to the temp node, then return the current node
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int[] res = new int[] {n};
        return helper(temp, res);
    }
    public ListNode helper(ListNode temp, int[] res) {
        if (temp == null)
            return null;
        ListNode node = helper(temp.next, res);
        res[0] = res[0]-1;
        if (res[0] == 0)
            return node;
        temp.next = node;
        return temp;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
    Memory Usage: 37.7 MB, less than 6.37% of Java online submissions for Remove Nth Node From End of List.
*/
