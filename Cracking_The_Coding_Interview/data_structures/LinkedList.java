package data_structures;
import java.util.*;
public class LinkedList {
    ListNode head;  // head of LinkedList
    ListNode tail;
    // constructors
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public LinkedList(int val) {
        this.head = new ListNode(val);
        this.tail = head;
    }
    public LinkedList(ListNode newHead) {
        this.head = newHead;
        ListNode temp = this.head;
        while (temp.next != null)  {
            temp = temp.next;
        }
        this.tail = temp;
    }

    /*  CRACKING THE CODING INTERVIEW PROBLEMS - CHAPTER 2  */
    // 2.1 Remove Duplicates
    public void removeDuplicates() {
        if (head == null || head == tail)
            return;
        Set<Integer> set = new HashSet<>();
        ListNode temp = this.head;
        ListNode prior = null;
        while (temp.next != null && temp.next != this.tail) {
            if (set.contains(temp.val)) {
                prior.next = temp.next;
                temp = temp.next;
            } else {
                set.add(temp.val);
                prior = temp;
                temp = temp.next;
            }
        }
        if (set.contains(tail.val)) {
            prior.next = null;
            this.tail = prior;
        }
    }
    // 2.2 return kth from end of Linked List
    public int returnKthToLast(int k) {
        if (head == null)
            return -1;
        int count = 0;
        ListNode temp = this.head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (k > count)
            return -1;
        temp = this.head;
        while (count - k - 1 > 0) {
            temp = temp.next;
            k++;
        }
        return temp.val;
    }

    /*  HELPER METHODS  */
    // get head method - returns the head of the linked list
    public ListNode getHead() {
        return this.head;
    }
    public ListNode getTail() {
        return this.tail;
    }
    // add function
    public boolean add(int val) {
        if (this.head == null) {
            this.head = new ListNode(val);
            this.tail = this.head;
            return true;
        }
        ListNode temp = tail;
        temp.next = new ListNode(val);
        this.tail = temp.next;
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
        this.tail = tempList.getTail();
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
        this.tail = temp;
    }
}
