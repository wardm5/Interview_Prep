package data_structures;
import java.util.*;
public class LinkedList {
    ListNode head;  // head of LinkedList
    // constructors
    public LinkedList() {
        this.head = null;
    }
    public LinkedList(int val) {
        this.head = new ListNode(val);
    }
    public LinkedList(ListNode newHead) {
        this.head = newHead;
    }

    /*  CRACKING THE CODING INTERVIEW PROBLEMS - CHAPTER 2  */
    // 2.1 Remove Duplicates
    public void removeDuplicates() {
        print();
        if (head == null)
            return;
        Set<Integer> set = new HashSet<>();
        ListNode temp = this.head;
        ListNode prior = null;
        while (temp != null) {
            if (set.contains(temp.val)) {
                prior.next = temp.next;
                temp = temp.next;
            } else {
                set.add(temp.val);
                prior = temp;
                temp = temp.next;
            }
        }
        print();
    }
    // 2.2 return kth from end of Linked List
    public int returnKthToLast(int k) {
        ListNode p1 = this.head;
        ListNode p2 = this.head;
        for (int i = 1; i <= k; i++) {
            if (p1 == null)
                return -1;
            p1 = p1.next;
        }
        while (p1 != null) {
            // System.out.println("val:   " + p2.val);
            p1 = p1.next;
            if (p2.next == null)
                return p2.val;
            p2 = p2.next;
        }
        return p2.val;
    }



    /*  HELPER METHODS  */
    // get head method - returns the head of the linked list
    public ListNode getHead() {
        return this.head;
    }
    // add function
    public boolean add(int val) {
        if (this.head == null) {
            this.head = new ListNode(val);
            return true;
        }
        ListNode temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(val);
        return true;
    }
    // return new list - returns new list for problems
    public void createList() {
        LinkedList tempList = new LinkedList(7);
        tempList.add(8);
        tempList.add(2);
        tempList.add(4);
        tempList.add(4);
        tempList.add(10);
        tempList.add(3);
        tempList.add(1);
        tempList.add(2);
        this.head = tempList.getHead();
    }
    // print method
    public void print() {
        System.out.print("Printing List:   ");
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
    // replaces list with new head
    public void replaceList(ListNode newHead) {
        this.head = newHead;
        ListNode temp = this.head;
        while (temp.next != null)  {
            temp = temp.next;
        }
    }
}
