//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Merge two sorted linked lists and return it as a new list. The new list should
be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create variables to store temp references
    2) while the lists are not null
        2.1) if the first node's value is greater than the second node, then create new node with that value
        2.2) else create new node with second's value
    3) if node 1 is null, then set the rest of the list to the reference to second node
    4) if node 2 is null, then set the rest of the list to the reference to the first node
    5) return result node (.next)
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        ListNode res = new ListNode(0);
        ListNode resTemp = res;
        while (l1Temp != null && l2Temp != null) {
            if (l1Temp.val > l2Temp.val) {
                resTemp.next = new ListNode(l2Temp.val);
                l2Temp = l2Temp.next;
                resTemp = resTemp.next;
            } else {
                resTemp.next = new ListNode(l1Temp.val);
                l1Temp = l1Temp.next;
                resTemp = resTemp.next;
            }
        }
        if (l1Temp == null)
            resTemp.next = l2Temp;
        else
            resTemp.next = l1Temp;
        return res.next;
    }
}

/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
    Memory Usage: 38.8 MB, less than 19.53% of Java online submissions for Merge Two Sorted Lists.
*/
