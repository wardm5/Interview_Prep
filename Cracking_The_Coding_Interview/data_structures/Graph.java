package data_structures;
import java.util.*;
public class Graph {
    Set<GraphNode> graph;
    public Graph() {
        this.graph = new HashSet<>();
    }
    public Graph(int val) {
        GraphNode root = new GraphNode(val);
        this.graph = new HashSet<>();
        this.graph.add(root);
    }
    public boolean addConnection(int a, int b) {
        GraphNode tempB = new GraphNode(b);
        System.out.println("tempB " + b + " =     " + tempB);
        for (GraphNode temp : graph) {
            if (temp.val == a) {
                graph.add(tempB);
                temp.addConnection(tempB);
                return true;
            }
        }
        GraphNode tempA = new GraphNode(a);
        System.out.println("tempA " + a + " =     " + tempA);
        // System.out.println("tempB " + b + " =     " + tempB);
        tempA.addConnection(tempB);
        graph.add(tempA);
        // graph.add(tempB);
        return true;
    }
    public void printDFS() {
        for (GraphNode node : this.graph) {
            if (node.visited)
                continue;
            printDFS(node);
            System.out.println();
        }
    }
    private void printDFS(GraphNode temp) {
        if (temp.visited)
            return;
        System.out.print(temp.val + " ");
        temp.visited = true;
        // System.out.println("node value: " + temp.val + "      connections: " + temp.connections);
        for (GraphNode node : temp.connections) {
            if (node.visited)
                continue;
            printDFS(node);
        }
        temp.visited = false;
    }

}
