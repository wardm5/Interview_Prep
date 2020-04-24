import data_structures.*;
public class Solutions {
    public static void main(String[] args) {
        ListNode temp = new ListNode(5);
        temp.next = new ListNode(39);
        LinkedList list = new LinkedList();
        list.createList();
        list.print();
        list.removeDuplicates();
        list.print();
        System.out.println(list.returnKthToLast(2));
        System.out.println(list.returnKthToLast(0));
        System.out.println(list.returnKthToLast(6));
        System.out.println(list.returnKthToLast(7));
    }
}
