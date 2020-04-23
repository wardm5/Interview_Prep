import data_structures.*;
public class Solutions {
    public static void main(String[] args) {
        ListNode temp = new ListNode(5);
        temp.next = new ListNode(39);
        LinkedList list = new LinkedList(temp);
        list.add(6);
        list.print();
    }
}
