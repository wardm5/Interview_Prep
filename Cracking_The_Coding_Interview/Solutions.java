import data_structures.*;
public class Solutions {
    public static void main(String[] args) {
        runLinkedListProblems();
        runGraphProblems();
    }
    public static void runLinkedListProblems() {
        LinkedList list = new LinkedList();
        list.createList();
        list.removeDuplicates();    // Printing List:   7 8 2 4 10 3
        System.out.println(list.returnKthToLast(2));     // Should be 3
        System.out.println(list.returnKthToLast(0));     // Should be 1
        System.out.println(list.returnKthToLast(6));     // Should be 8
        System.out.println(list.returnKthToLast(7));     // Should be -7
        System.out.println(list.returnKthToLast(8));     // Should be -1
        System.out.println("\n");
    }
    public static void runGraphProblems() {
        Graph graph = new Graph();
        graph.printDFS();
        graph.addConnection(5,2);
        graph.addConnection(5,1);
        graph.addConnection(1,8);
        graph.addConnection(9,3);
        graph.printDFS();
    }
}
