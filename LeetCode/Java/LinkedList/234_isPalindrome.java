//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
234. Palindrome Linked List
Easy

Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create a temporary node for head and boolean array
    2) call recursive method
        2.1) check if node is null, return null if true
        2.2) if the next of the node is null, and the values of the first and last dont match, set boolean to false, else return first.next
        2.3)  create temporary node and call recursive method
        2.4) check if the temp node's value matches the current node's, if not set boolean to false
        2.5) return temp node's next value 
    3) return boolean array result
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
    public boolean isPalindrome(ListNode head) {
        ListNode first = head;
        boolean[] res = new boolean[] {true};
        helper(first, first, res);
        return res[0];
    }
    public ListNode helper(ListNode first, ListNode last, boolean[] res) {
        if (last == null)
            return null;
        if (last.next == null) {
            if (first.val != last.val)
                res[0] = false;
            return first.next;
        }
        ListNode tempNode = helper(first, last.next, res);
        if (tempNode.val != last.val)
            res[0] = false;
        return tempNode.next;
    }
}

/*
    Runtime: 1 ms, faster than 94.45% of Java online submissions for Palindrome Linked List.
    Memory Usage: 46.2 MB, less than 6.10% of Java online submissions for Palindrome Linked List.
*/
