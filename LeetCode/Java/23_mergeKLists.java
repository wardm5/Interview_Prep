//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Merge k sorted linked lists and return it as one sorted list. Analyze and
describe its complexity.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create list to store values in sorted lists
    2) loop through lists of lists
    3) for each node, place value into ArrayList
    4) if the list size == 0, then return null
    5) else sort the list
    6) create new result head node, temp which references the head
    7) loop through ArrayList to place values into the result list
    8) return result ListNode
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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
        }
        if (list.size() == 0)
            return null;
        Collections.sort(list);
        ListNode res = new ListNode(list.get(0));
        ListNode temp = res;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return res;
    }
}

/*
    Runtime: 6 ms, faster than 45.60% of Java online submissions for Merge k Sorted Lists.
    Memory Usage: 41.4 MB, less than 40.44% of Java online submissions for Merge k Sorted Lists.
*/
