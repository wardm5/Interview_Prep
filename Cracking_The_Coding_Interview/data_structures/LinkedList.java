package data_structures;
public class LinkedList {
    ListNode head;
    public LinkedList() {
        this.head = null;
    }
    public LinkedList(int val) {
        head = new ListNode(val);
    }
    public ListNode getHead() {
        return head;
    }
    public LinkedList(ListNode newHead) {
        this.head = newHead;
    }
    public void print() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        ListNode temp = head;
        while (temp!= null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void replaceList(ListNode newHead) {
        this.head = newHead;
    }
}
