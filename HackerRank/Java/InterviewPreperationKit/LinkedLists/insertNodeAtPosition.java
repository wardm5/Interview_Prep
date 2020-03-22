/*
  * For your reference:
  *
  * SinglyLinkedListNode {
  *     int data;
  *     SinglyLinkedListNode next;
  * }
  *
  */
 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
     SinglyLinkedListNode temp = head;
     SinglyLinkedListNode prior = null;
     int count = 0;
     while (temp != null || count > position) {
         if (count == position) {
             SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
             prior.next = newNode;
             newNode.next = temp;
             return head;
         }
         count++;
         prior = temp;
         temp = temp.next;
     }
     return head;
 }
