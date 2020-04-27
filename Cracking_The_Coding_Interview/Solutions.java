import data_structures.*;
public class Solutions {
    public static void main(String[] args) {
        ListNode temp = new ListNode(5);
        temp.next = new ListNode(39);
        LinkedList list = new LinkedList();
        list.createList();
        list.removeDuplicates();    // Printing List:   7 8 2 4 10 3
        System.out.println(list.returnKthToLast(2));     // Should be 4
        System.out.println(list.returnKthToLast(0));     // Should be 3
        System.out.println(list.returnKthToLast(6));     // Should be 7
        System.out.println(list.returnKthToLast(7));     // Should be -1
        System.out.println(list.returnKthToLast(8));     // Should be -1
    }
}
