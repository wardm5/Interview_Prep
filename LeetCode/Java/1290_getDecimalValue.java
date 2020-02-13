//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Given head which is a reference node to a singly-linked list. The value of each
node in the linked list is either 0 or 1. The linked list holds the binary
representation of a number.

Return the decimal value of the number in the linked list.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) traverse recurisvly through nodes with helper
    2) once null, return 0
    3) if value of node is 1, then get the power of the value and then increment Sum
    4) if the value is not 1, then increment count
    5) return sum

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
     public int getDecimalValue(ListNode head) {
         return helper(head)[0];
     }
     public int[] helper(ListNode node) {
         if (node == null)
             return new int[] {0,0};
         else if (node.val == 1){
             int[] res = helper(node.next);
             res[0] +=  Math.pow(2, res[1]);
             res[1] = res[1] + 1;
             return res;
         } else {
             int[] res = helper(node.next);
             res[1] = res[1] + 1;
             return res;
         }
     }
 }
/*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
    Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
*/
