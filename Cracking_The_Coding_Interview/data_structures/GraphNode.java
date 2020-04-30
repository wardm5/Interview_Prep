package data_structures;
import java.util.*;
public class GraphNode {
    int val;
    int weight;
    boolean visited;
    Set<GraphNode> connections;
    public GraphNode() {
        this.visited = false;
        this.val = 0;
        this.weight = 0;
        this.connections = new HashSet<>();
    }
    public GraphNode(int val) {
        this.visited = false;
        this.val = val;
        this.weight = 0;
        this.connections = new HashSet<>();
    }
    public GraphNode(int val, int weight) {
        this.visited = false;
        this.val = val;
        this.weight = 0;
        this.connections = new HashSet<>();
    }
    public boolean addConnection(GraphNode val) {
        if (connections.contains(val))
            return false;
        connections.add(val);
        return true;
    }
}
