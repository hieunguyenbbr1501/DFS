package com.company;

import java.util.ArrayList;

public class Node {
    public int value;
    public boolean visited;
    public ArrayList<Node> neighbors;
    public Node(int value) {
        this.value = value;
        this.visited = false;
        this.neighbors = new ArrayList<Node>();
    }
    public void addNeighbor(Node node) {
        this.neighbors.add(node);
        node.neighbors.add(this);
    }
}
