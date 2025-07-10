package models;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>(); 
    }

    public int getValue() {
        return value;
    }

    public void addNeighbor(Node node) {
        if (!neighbors.contains(node)) {
            neighbors.add(node);
        }
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }
}